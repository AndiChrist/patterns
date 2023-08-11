package io.github.andichrist.behavioral.state.account;

// Konkrete Zustände
class PositiveState implements AccountState {
  private double balance;

  public PositiveState(double balance) {
    this.balance = balance;
  }

  @Override
  public double deposit(double amount) {
    return balance += amount;
  }

  @Override
  public double withdraw(double amount) {
    if (balance - amount >= 0) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds!");
    }

    return balance;
  }
}
