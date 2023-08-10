package io.github.andichrist.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Testskripte können folgendermaßen aussehen
public class LoginTest {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://example.com");

    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterUsername("testuser");
    loginPage.enterPassword("password");
    loginPage.clickLoginButton();

    // Weitere Tests und Überprüfungen hier...

    driver.quit();
  }
}
