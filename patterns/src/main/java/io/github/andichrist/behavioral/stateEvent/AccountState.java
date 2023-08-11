package io.github.andichrist.behavioral.stateEvent;

// Zustandsschnittstelle
interface AccountState {
  double deposit(double amount);
  double withdraw(double amount);
}
