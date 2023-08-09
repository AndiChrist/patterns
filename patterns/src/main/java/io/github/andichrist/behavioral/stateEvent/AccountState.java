package io.github.andichrist.behavioral.stateEvent;

// Zustandsschnittstelle
interface AccountState {
  void deposit(double amount);
  void withdraw(double amount);
}
