package io.github.andichrist.behavioral.state.account;

// Kontextklasse
class Account {
  private AccountState state;
  private double balance;  // Kontostand

  public Account(double balance) {
    this.balance = balance;

    if (balance >= 0) {
      state = new PositiveState(balance);
    } else {
      state = new OverdraftState(balance, -1000.0); // Beispielhaftes Überziehungslimit
    }
  }

  public void deposit(double amount) {
    balance = state.deposit(amount);
  }

  public void withdraw(double amount) {
    balance = state.withdraw(amount);
  }

  public void setState(AccountState state) {
    this.state = state;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
