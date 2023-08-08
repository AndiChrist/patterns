package io.github.andichrist.structural.adapter;

// Der Adapter, der die neue Schnittstelle implementiert und den Legacy-Service verwendet
public class LegacyServiceAdapter implements NewService {
  private LegacyService legacyService;

  public LegacyServiceAdapter(LegacyService legacyService) {
    this.legacyService = legacyService;
  }

  @Override
  public void newRequest() {
    System.out.println("Adapter is converting the new request to the legacy request.");
    legacyService.legacyRequest();
  }
}
