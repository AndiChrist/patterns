package io.github.andichrist.testing.structure;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 Teststruktur-Muster. Derselbe Gedanke, zwei Schreibweisen:
   AAA  - Arrange / Act / Assert (auch: Four-Phase Test: Setup-Exercise-Verify-Teardown)
   GWT  - Given / When / Then (BDD-Stil, in fachlicher Sprache)
 Beide machen die Phasen eines Tests sichtbar und halten sie sauber getrennt.
 */
class TestStructureTest {

  @Test
  void einzahlung_erhoeht_den_kontostand_aaa() {
    // Arrange
    Account account = new Account(100);

    // Act
    account.deposit(50);

    // Assert
    assertEquals(150, account.balance());
  }

  @Test
  void abhebung_ueber_dem_guthaben_schlaegt_fehl_gwt() {
    // Given: ein Konto mit Stand 100
    Account account = new Account(100);

    // When: mehr abgehoben wird, als vorhanden ist
    Executable abheben = () -> account.withdraw(150);

    // Then: schlägt es fehl und der Stand bleibt unverändert
    assertThrows(IllegalStateException.class, abheben);
    assertEquals(100, account.balance());
  }
}
