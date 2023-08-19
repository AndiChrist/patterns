package io.github.andichrist.behavioral.interceptor;

import java.util.ArrayList;
import java.util.List;

// Interceptor-Kette (Chain)
class InterceptorChain {
  private List<Interceptor> interceptors = new ArrayList<>();

  public void addInterceptor(Interceptor interceptor) {
    interceptors.add(interceptor);
  }

  public void executeInterceptors(String request) {
    for (Interceptor interceptor : interceptors) {
      interceptor.execute(request);
    }
  }
}
