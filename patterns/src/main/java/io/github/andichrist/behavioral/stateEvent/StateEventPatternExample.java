package io.github.andichrist.behavioral.stateEvent;

/*
 Das "State/Event"-Entwurfsmuster ist eine Kombination aus dem Zustandsmuster (State
 Pattern) und dem Ereignismuster (Event Pattern). Es wird oft verwendet, um den Zustand
 eines Objekts zu steuern und auf Ereignisse zu reagieren, indem es den Zustand des
 Objekts ändert.

 In diesem Beispiel werden wir ein einfaches Konto-Objekt erstellen, das verschiedene
 Zustände und Ereignisse verwendet, um den Kontostand zu verwalten. Dabei verwenden wir
 das "State/Event"-Entwurfsmuster.

 In diesem Beispiel haben wir ein Kontosystem mit zwei Zuständen (PositiveState und
 OverdraftState) und einer Kontextklasse (Account), die je nach Kontostand
 unterschiedliche Verhaltensweisen aufweist. Das Beispiel illustriert, wie das
 "State/Event"-Entwurfsmuster verwendet werden kann, um den Kontozustand und die
 Ereignisse (Einzahlungen und Auszahlungen) zu verwalten.
 */
// Beispielanwendung
public class StateEventPatternExample {
  public static void main(String[] args) {
    Account account = new Account(500.0);

    account.deposit(300.0);
    account.withdraw(700.0);

    // Wechsel des Kontozustands
    account.setState(new OverdraftState(account.getBalance(), -1500.0));

    account.withdraw(1200.0);
  }
}
