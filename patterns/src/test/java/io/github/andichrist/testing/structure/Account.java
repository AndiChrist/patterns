package io.github.andichrist.testing.structure;

public class Account {
  private long balance;

  public Account(long initialBalance) {
    this.balance = initialBalance;
  }

  public long balance() {
    return balance;
  }

  public void deposit(long amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("amount must be positive");
    }
    balance += amount;
  }

  public void withdraw(long amount) {
    if (amount > balance) {
      throw new IllegalStateException("insufficient funds");
    }
    balance -= amount;
  }
}
