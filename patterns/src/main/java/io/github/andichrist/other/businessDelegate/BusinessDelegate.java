package io.github.andichrist.other.businessDelegate;

// Business Delegate
class BusinessDelegate {
  private BusinessService businessService;

  public void setServiceType(String serviceType) {
    if (serviceType.equalsIgnoreCase("EJB")) {
      businessService = new EJBService();
    } else if (serviceType.equalsIgnoreCase("JMS")) {
      businessService = new JMSService();
    }
  }

  public void doTask() {
    businessService.doProcessing();
  }
}
