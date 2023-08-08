package io.github.andichrist.other.policy;

// Die konkrete Implementierung einer Zahlungsstrategie
public class CreditCardPayment implements PaymentStrategy {
  private String cardNumber;
  private String name;

  public CreditCardPayment(String cardNumber, String name) {
    this.cardNumber = cardNumber;
    this.name = name;
  }

  @Override
  public void pay(int amount) {
    System.out.println(amount + " paid with Credit Card");
  }
}
