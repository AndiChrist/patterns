package io.github.andichrist.behavioral.state.account;

class OverdraftState implements AccountState {
  private double balance;
  private double overdraftLimit;

  public OverdraftState(double balance, double overdraftLimit) {
    this.balance = balance;
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  public double deposit(double amount) {
    return balance += amount;
  }

  @Override
  public double withdraw(double amount) {
    if (balance - amount >= overdraftLimit) {
      balance -= amount;
    } else {
      System.out.println("Exceeded overdraft limit!");
    }

    return balance;
  }
}
