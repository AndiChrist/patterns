package io.github.andichrist.messagingPatterns.message.wikipedia;

import org.apache.camel.CamelContext;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import static java.lang.System.out;

// https://de.wikipedia.org/wiki/Message_(Entwurfsmuster)
class MultipleMessagesSample {

  private static final CamelContext camelContext = new DefaultCamelContext();

  public static void main(String[] args) throws Exception {

    var data = new Data();

    camelContext.getCamelContextExtension().setName("Multiple Messages Sample");
    camelContext.addRoutes(new RouteBuilder() {

      @Override
      public void configure() {

        onException(NoSuchElementException.class)
            .handled(true)
            .stop(); // aktuelle Übertragung wird abgebrochen

        from("timer:start")
            .process().message(m -> m.setBody(data.remove())) // EIP Message; throws NoSuchElementException if empty Queue
            .process().message(m -> print("Sending", m))
            .log("Sending...")
            .to("direct:receive") // EIP Sender
            .setId("Sender");

        from("direct:receive") // EIP Receiver
            .log("Receiving...")
            .process().message(m -> print("Receiving", m)) // EIP Message
            .setId("Receiver");
      }
    });
    camelContext.start();
    Thread.sleep(4000);
    camelContext.stop();
    camelContext.close();
  }

  static void print(final String process, final Message m) {
    out.printf("%s %s: %s%n", process, m, m.getBody());
  }

  static class Data extends LinkedList<String> {
    Data() {
      add("**** 1st  info ****");
      add("**** 2nd  info ****");
      add("**** 3rd  info ****");
    }
  }

}
