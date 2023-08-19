package io.github.andichrist.behavioral.interceptor;

class LoggingInterceptor implements Interceptor {
  @Override
  public void execute(String request) {
    System.out.println("Logging request: " + request);
  }
}
