package io.github.andichrist.other.businessDelegate;

class EJBService implements BusinessService {
  @Override
  public void doProcessing() {
    System.out.println("Processing task using EJB Service");
  }
}
