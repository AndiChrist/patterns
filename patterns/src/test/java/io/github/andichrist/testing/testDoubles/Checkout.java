package io.github.andichrist.testing.testDoubles;

// SUT (System Under Test) samt seiner Kollaborateure für die Test-Doubles-Beispiele.
public class Checkout {

  public interface DiscountRepository {
    double discountFor(String customer); // 0.0 .. 1.0
  }

  public interface MailService {
    void send(String to, String body);
  }

  private final DiscountRepository discounts;
  private final MailService mail;

  public Checkout(DiscountRepository discounts, MailService mail) {
    this.discounts = discounts;
    this.mail = mail;
  }

  // Nutzt KEINE Kollaborateure -> in dessen Test sind beide nur Dummies.
  public double subtotal(double price, int quantity) {
    return price * quantity;
  }

  // Nutzt beide Kollaborateure.
  public double checkout(String customer, double amount) {
    double discount = discounts.discountFor(customer);
    double total = amount * (1 - discount);
    mail.send(customer, "Bestellsumme: " + total);
    return total;
  }
}
