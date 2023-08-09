package io.github.andichrist.behavioral.stateEvent;

// Konkrete Zustände
class PositiveState implements AccountState {
  private double balance;

  public PositiveState(double balance) {
    this.balance = balance;
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public void withdraw(double amount) {
    if (balance - amount >= 0) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds!");
    }
  }
}
