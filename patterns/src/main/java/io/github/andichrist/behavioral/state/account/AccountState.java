package io.github.andichrist.behavioral.state.account;

// Zustandsschnittstelle
interface AccountState {
  double deposit(double amount);
  double withdraw(double amount);
}
