package io.github.andichrist.messagingPatterns.message.wikipedia;

import org.apache.camel.CamelContext;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import static java.lang.System.out;

// https://de.wikipedia.org/wiki/Message_(Entwurfsmuster)
class SingleMessageSample {

  private static final CamelContext camelContext = new DefaultCamelContext();

  public static void main(String[] args) throws Exception {

    var data = new Data();

    camelContext.getCamelContextExtension().setName("Single Message Sample");
    camelContext.addRoutes(new RouteBuilder() {

      @Override
      public void configure() {

        from("timer:start?repeatCount=1")
            .process().message(m -> m.setBody(data)) // EIP Message
            .process().message(m -> print("Send", m))
            .log("Sending...")
            .to("direct:receive") // EIP Sender
            .setId("Sender");

        from("direct:receive") // EIP Receiver
            .log("Receiving...")
            .process().message(m -> print("Receive", m)) // EIP Message
            .setId("Receiver");
      }
    });
    camelContext.start();
    Thread.sleep(2000);
    camelContext.stop();
    camelContext.close();
  }

  static void print(final String endpoint, final Message m) {
    out.printf("%s %s: %s%n", endpoint, m, m.getBody(Data.class).info);
  }

  static class Data {
    String info = "**** containing information ****";
  }

}
