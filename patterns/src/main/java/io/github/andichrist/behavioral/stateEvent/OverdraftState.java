package io.github.andichrist.behavioral.stateEvent;

class OverdraftState implements AccountState {
  private double balance;
  private double overdraftLimit;

  public OverdraftState(double balance, double overdraftLimit) {
    this.balance = balance;
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public void withdraw(double amount) {
    if (balance - amount >= overdraftLimit) {
      balance -= amount;
    } else {
      System.out.println("Exceeded overdraft limit!");
    }
  }
}
