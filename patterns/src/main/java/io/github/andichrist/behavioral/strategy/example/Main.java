package io.github.andichrist.behavioral.strategy.example;

/*
 Das Strategy-Muster, auch bekannt als Policy-Muster, ermöglicht es, Algorithmen in
 separaten Strategie-Klassen zu definieren und sie auszutauschen, ohne den Code des
 Kontexts ändern zu müssen. Der Kontext ist die Klasse, die eine bestimmte Strategie
 verwendet. Dadurch wird es möglich, das Verhalten einer Klasse zur Laufzeit zu ändern,
 indem verschiedene Strategien ausgetauscht werden.

 Hier ist ein einfaches Java-Beispiel für das Strategy-Muster.

 Im Beispiel haben wir das Strategy-Muster verwendet, um verschiedene Zahlungsstrategien
 zu implementieren. Die Klasse ShoppingCart ist der Kontext und kann die Zahlungsstrategie
 ändern, ohne den Code des Kontexts zu ändern. Dadurch können wir zur Laufzeit verschiedene
 Zahlungsstrategien auswählen, indem wir die entsprechende Strategie setzen.

 Der Kontext (ShoppingCart) kann die Zahlungsmethode durch Setzen der gewünschten Strategie
 ändern. Dadurch wird die Flexibilität erreicht, verschiedene Zahlungsstrategien in
 derselben Klasse zu verwenden, ohne die Klasse selbst ändern zu müssen. Das Strategy-Muster
 ermöglicht es, die Strategien auszutauschen und das Verhalten der Klasse zur Laufzeit zu
 ändern.
 */
public class Main {
  public static void main(String[] args) {
    // Erstelle den Kontext (Warenkorb)
    ShoppingCart cart = new ShoppingCart();

    // Wähle die Zahlungsstrategie (PayPal)
    PaymentStrategy paypalPayment = new PayPalPayment("example@example.com");
    cart.setPaymentStrategy(paypalPayment);

    // Führe den Checkout-Vorgang durch
    cart.checkout(100);

    // Ändere die Zahlungsstrategie (Kreditkarte)
    PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
    cart.setPaymentStrategy(creditCardPayment);

    // Führe den Checkout-Vorgang erneut durch
    cart.checkout(200);

    // Ausgabe:
    // 100 paid with PayPal
    // 200 paid with Credit Card
  }
}
