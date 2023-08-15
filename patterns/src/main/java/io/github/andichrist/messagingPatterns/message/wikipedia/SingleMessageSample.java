package io.github.andichrist.messagingPatterns.message.wikipedia;

import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import static java.lang.System.out;

class SingleMessageSample {

  static class Data {
    String info = "**** containing information ****";
  } // Data

  private static final DefaultCamelContext cc = new DefaultCamelContext();

  public static void main( final String... args ) throws Exception {

    final Data data = new Data();

    cc.setName( "SingleMessageSample" );
    cc.addRoutes( new RouteBuilder() {

      @Override
      public void configure() {

        from( "timer:start?repeatCount=1" )
            .process().message( m -> m.setBody( data ) ) // EIP Message
            .process().message( m -> print( "Send", m ) )
            .log( "Sending..." )
            .to( "direct:receive" ) // EIP Sender
            .setId( "Sender" );

        from( "direct:receive" ) // EIP Receiver
            .log( "Receiving..." )
            .process().message( m -> print( "Receive", m ) ) // EIP Message
            .setId( "Receiver" );
      }
    } );
    cc.start();
    Thread.sleep( 2000 );
    cc.stop();
    cc.close();
  } // main()

  static void print( final String endpoint, final Message m ) {
    out.printf( "%s %s: %s%n", endpoint, m, m.getBody( Data.class ).info );
  } // print()

} // SingleMessageSample
