package io.github.andichrist.testing.testDoubles;

import io.github.andichrist.testing.testDoubles.Checkout.DiscountRepository;
import io.github.andichrist.testing.testDoubles.Checkout.MailService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 Test Doubles nach Gerard Meszaros (xUnit Test Patterns) — handgeschrieben, ohne Framework,
 damit der Unterschied sichtbar bleibt. Fünf Arten, vom "passiven" zum "aktiven" Double:

   Dummy  - wird übergeben, aber nie benutzt (nur um Parameterlisten zu füllen)
   Stub   - liefert vorgegebene Antworten (steuert den indirekten Input des SUT)
   Fake   - funktionierende, aber vereinfachte Implementierung (z. B. In-Memory statt DB)
   Spy    - zeichnet auf, wie er aufgerufen wurde (Verifikation NACH dem Exercise)
   Mock   - kennt die Erwartung vorab und verifiziert sie selbst (Behavior Verification)

 Hinweis zum PCS-QA-Testkonzept: im echten Produkt-Setup kommen Mocks nur auf
 Komponentenebene und werden aus OpenAPI-Specs (Prism/MSW) erzeugt, nicht von Hand.
 Diese Beispiele dienen dem Verständnis der Begriffe.
 */
class TestDoublesTest {

  // --- DUMMY ----------------------------------------------------------------
  @Test
  void dummy_wird_uebergeben_aber_nie_benutzt() {
    DiscountRepository dummyDiscounts = customer -> { throw new AssertionError("nicht benutzt"); };
    MailService dummyMail = (to, body) -> { throw new AssertionError("nicht benutzt"); };

    Checkout checkout = new Checkout(dummyDiscounts, dummyMail);

    // subtotal() rührt keine Kollaborateure an -> die Dummies werden nie aufgerufen.
    assertEquals(30.0, checkout.subtotal(10.0, 3));
  }

  // --- STUB -----------------------------------------------------------------
  @Test
  void stub_liefert_vorgegebene_antwort() {
    DiscountRepository stub = customer -> 0.10; // feste Antwort
    MailService dummyMail = (to, body) -> { };

    Checkout checkout = new Checkout(stub, dummyMail);

    assertEquals(90.0, checkout.checkout("anna", 100.0));
  }

  // --- FAKE -----------------------------------------------------------------
  @Test
  void fake_ist_eine_vereinfachte_implementierung() {
    // Funktioniert echt, aber in-memory statt Datenbank.
    Map<String, Double> table = new HashMap<>();
    table.put("vip", 0.20);
    DiscountRepository fake = customer -> table.getOrDefault(customer, 0.0);
    MailService dummyMail = (to, body) -> { };

    Checkout checkout = new Checkout(fake, dummyMail);

    assertEquals(80.0, checkout.checkout("vip", 100.0));
    assertEquals(100.0, checkout.checkout("gast", 100.0));
  }

  // --- SPY ------------------------------------------------------------------
  @Test
  void spy_zeichnet_aufrufe_auf_und_wird_danach_geprueft() {
    DiscountRepository stub = customer -> 0.0;

    List<String> sent = new ArrayList<>();
    MailService spy = (to, body) -> sent.add(to + ":" + body); // zeichnet auf

    Checkout checkout = new Checkout(stub, spy);
    checkout.checkout("bob", 50.0);

    // State Verification NACH dem Exercise.
    assertEquals(1, sent.size());
    assertEquals("bob:Bestellsumme: 50.0", sent.get(0));
  }

  // --- MOCK -----------------------------------------------------------------
  @Test
  void mock_kennt_die_erwartung_vorab_und_verifiziert_sich_selbst() {
    DiscountRepository stub = customer -> 0.0;

    // Handgeschriebener Mock: Erwartung wird vorab gesetzt, send() prüft sofort,
    // verify() stellt am Ende sicher, dass der Aufruf überhaupt kam.
    var mailMock = new MailService() {
      private String expectedTo;
      private String expectedBody;
      private boolean called = false;

      void expect(String to, String body) {
        this.expectedTo = to;
        this.expectedBody = body;
      }

      @Override
      public void send(String to, String body) {
        called = true;
        assertEquals(expectedTo, to, "unerwarteter Empfänger");
        assertEquals(expectedBody, body, "unerwarteter Inhalt");
      }

      void verify() {
        assertTrue(called, "erwarteter send()-Aufruf blieb aus");
      }
    };
    mailMock.expect("carol", "Bestellsumme: 200.0");

    Checkout checkout = new Checkout(stub, mailMock);
    checkout.checkout("carol", 200.0);

    mailMock.verify(); // Behavior Verification
  }
}
