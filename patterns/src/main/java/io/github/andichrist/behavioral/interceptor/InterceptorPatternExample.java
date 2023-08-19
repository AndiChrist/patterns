package io.github.andichrist.behavioral.interceptor;

/*
 Das "Interceptor" Entwurfsmuster, auch bekannt als "Interceptor Chain" oder "Filter Chain", wird
 verwendet, um Verarbeitungsschritte oder Filter in einer bestimmten Reihenfolge auszuführen. Dieses
 Muster ermöglicht es, Verhaltensweisen oder Funktionen in einer flexiblen und erweiterbaren Art und
 Weise zu kombinieren, ohne die Hauptlogik zu ändern. Es wird oft in Anwendungen wie Webframeworks,
 Middleware oder aspektorientierter Programmierung eingesetzt.

 In diesem Beispiel haben wir drei konkrete Interceptor-Implementierungen: AuthenticationInterceptor,
 LoggingInterceptor und AuthorizationInterceptor. Diese Implementierungen führen jeweils spezifische
 Aufgaben aus, wenn sie aufgerufen werden.

 Die InterceptorChain repräsentiert die Kette von Interceptors. Sie ermöglicht das Hinzufügen von
 Interceptors und die Ausführung der Interceptors in der Reihenfolge, in der sie hinzugefügt wurden.

 Wenn wir die main-Methode ausführen, wird die InterceptorChain genutzt, um die definierten
 Interceptors nacheinander auszuführen und das Verhalten der Kette zu zeigen. Beachten Sie, dass
 dieses Beispiel sehr vereinfacht ist und in der Praxis die Verwendung von Schnittstellen,
 Kontextobjekten und anderen Mechanismen zur Kontrolle der Interceptor-Kette erforderlich sein könnte.
 */
public class InterceptorPatternExample {
  public static void main(String[] args) {
    InterceptorChain chain = new InterceptorChain();
    chain.addInterceptor(new AuthenticationInterceptor());
    chain.addInterceptor(new LoggingInterceptor());
    chain.addInterceptor(new AuthorizationInterceptor());

    String request = "GET /api/resource";
    chain.executeInterceptors(request);
  }
}
