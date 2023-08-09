package io.github.andichrist.other.businessDelegate;

class JMSService implements BusinessService {
  @Override
  public void doProcessing() {
    System.out.println("Processing task using JMS Service");
  }
}
