package io.github.andichrist.behavioral.interceptor;

// Konkrete Interceptor-Implementierungen
class AuthenticationInterceptor implements Interceptor {
  @Override
  public void execute(String request) {
    System.out.println("Authenticating request: " + request);
  }
}
