package io.github.andichrist.other.businessDelegate;

// Client
class Client {
  private BusinessDelegate businessDelegate;

  public Client(BusinessDelegate businessDelegate) {
    this.businessDelegate = businessDelegate;
  }

  public void doTask() {
    businessDelegate.doTask();
  }
}
