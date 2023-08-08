package io.github.andichrist.structural.adapter;

// Der Legacy-Service, der bereits existiert
public class LegacyServiceImpl implements LegacyService {
  @Override
  public void legacyRequest() {
    System.out.println("Legacy Service is handling the legacy request.");
  }
}
