package io.github.andichrist.testing.testDataBuilder;

import org.junit.jupiter.api.Test;

import static io.github.andichrist.testing.testDataBuilder.CustomerBuilder.aCustomer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 Test Data Builder.
 Statt in jedem Test alle Felder von Hand zu setzen, liefert der Builder valide
 Default-Daten; der Test überschreibt nur die für den Fall relevanten Werte. Das
 hält Tests lesbar (man sieht sofort, worum es geht) und robust gegen neue Felder.
 Entspricht den "Factories" aus dem PCS-QA-Testkonzept (Testdaten-Schicht).
 */
class TestDataBuilderTest {

  @Test
  void default_liefert_valides_objekt() {
    Customer c = aCustomer().build();

    assertEquals("Max Mustermann", c.name());
    assertTrue(c.active());
  }

  @Test
  void test_betont_nur_das_relevante_feld() {
    // Dieser Test handelt erkennbar von "minderjährig" — der Rest ist Rauschen.
    Customer minor = aCustomer().withAge(17).build();

    assertEquals(17, minor.age());
  }

  @Test
  void builder_ist_wiederverwendbar_fuer_varianten() {
    Customer inactive = aCustomer().withName("Erika").inactive().build();

    assertEquals("Erika", inactive.name());
    assertFalse(inactive.active());
  }
}
