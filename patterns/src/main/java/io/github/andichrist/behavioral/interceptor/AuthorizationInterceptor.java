package io.github.andichrist.behavioral.interceptor;

class AuthorizationInterceptor implements Interceptor {
  @Override
  public void execute(String request) {
    System.out.println("Authorizing request: " + request);
  }
}
