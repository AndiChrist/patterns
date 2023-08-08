package io.github.andichrist.structural.proxy;

// Das Stellvertreter-Objekt (Virtuelles Proxy), das den Zugriff auf das eigentliche Objekt
// kontrolliert
public class ProxyResource implements Resource {
  private RealResource realResource;

  @Override
  public void operation() {
    if (realResource == null) {
      realResource = new RealResource();
    }
    realResource.operation();
  }
}
