package io.github.andichrist.behavioral.state.account;

/*
 In diesem Beispiel werden wir ein einfaches Konto-Objekt erstellen, das verschiedene
 Zustände und Ereignisse verwendet, um den Kontostand zu verwalten.

 In diesem Beispiel haben wir ein Kontosystem mit zwei Zuständen (PositiveState und
 OverdraftState) und einer Kontextklasse (Account), die je nach Kontostand
 unterschiedliche Verhaltensweisen aufweist.
 */
// Beispielanwendung
public class StatePatternExample {
  public static void main(String[] args) {
    Account account = new Account(500.0);

    account.deposit(100.0);
    account.withdraw(700.0);

    // Wechsel des Kontozustands
    account.setState(new OverdraftState(account.getBalance(), -1500.0));

    account.withdraw(1200.0);
  }
}
