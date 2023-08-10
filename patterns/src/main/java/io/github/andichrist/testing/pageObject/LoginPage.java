package io.github.andichrist.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 Das "Page Object Pattern" ist ein Entwurfsmuster, das in der Testautomatisierung
 verwendet wird, um die Wartbarkeit, Lesbarkeit und Wiederverwendbarkeit von Testskripten
 zu verbessern. Es hilft dabei, die Interaktionen mit Webseiten oder Benutzeroberflächen
 (UIs) zu abstrahieren und zu organisieren.

 Das Hauptziel des "Page Object Pattern" besteht darin, eine klare Trennung zwischen den
 Testskripten und der tatsächlichen Implementierung der UI-Interaktionen herzustellen. Hier
 sind die grundlegenden Konzepte und Vorteile des Musters:

 1. Seitenobjekte (Page Objects): Statt Testskripte mit direkten UI-Interaktionen zu
    überladen, werden für jede Seite oder Komponente der Benutzeroberfläche separate
    Klassen erstellt, die als Seitenobjekte dienen. Diese Klassen abstrahieren die Details
    der UI und enthalten Methoden, die die Interaktionen auf dieser Seite abbilden.

 2. Wiederverwendbarkeit: Durch die Verwendung von Seitenobjekten können Testskripte auf
    höherer Ebene wiederverwendet werden. Wenn sich die UI ändert, müssen nur die
    entsprechenden Seitenobjekte aktualisiert werden, anstatt jeden Test zu ändern.

 3. Abstraktion: Seitenobjekte abstrahieren die Komplexität der UI-Interaktionen.
    Testskripte verwenden dann die Methoden der Seitenobjekte, um Aktionen auszuführen
    (z.B. Klicken, Ausfüllen von Formularen) und Informationen abzurufen (z.B. Texte,
    Status).

 4. Lesbarkeit: Testskripte werden durch die Verwendung von Seitenobjekten lesbarer und
    verständlicher, da sie sich auf die Geschäftslogik konzentrieren und die UI-Details
    auslagern.

 5. Wartbarkeit: Wenn sich die UI ändert, müssen Änderungen nur an den entsprechenden
    Seitenobjekten vorgenommen werden. Dies minimiert den Aufwand für die Aktualisierung
    von Testskripten.

 Im Beispiel haben wir die Klasse LoginPage erstellt, die ein Seitenobjekt für die
 Anmeldeseite einer Webanwendung darstellt. Die Annotations @FindBy stammen aus dem
 Test-Framework Selenium und werden verwendet, um die Webseitenelemente zu identifizieren.

 Durch die Verwendung des "Page Object Patterns" wird der Testcode lesbarer und wartbarer,
 da die Details der UI-Interaktionen in den Seitenobjekten gekapselt sind.
 */
public class LoginPage {
  private WebDriver driver;

  @FindBy(id = "username")
  private WebElement usernameInput;

  @FindBy(id = "password")
  private WebElement passwordInput;

  @FindBy(id = "loginButton")
  private WebElement loginButton;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void enterUsername(String username) {
    usernameInput.sendKeys(username);
  }

  public void enterPassword(String password) {
    passwordInput.sendKeys(password);
  }

  public void clickLoginButton() {
    loginButton.click();
  }
}
