package io.github.andichrist.other.policy;

// Die konkrete Implementierung einer Zahlungsstrategie
public class PayPalPayment implements PaymentStrategy {
  private String email;

  public PayPalPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + " paid with PayPal");
  }
}
