package io.github.andichrist.other.remotecommand.client;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import io.github.andichrist.other.remotecommand.Command;
import io.github.andichrist.other.remotecommand.CommandProcessor;

/**
 *	Main program to run the client.
 */
public class Client {

    protected final static String host = "localhost";

    /** This is the main program, just to get things started. */
    public static void main(String[] argv) throws IOException, NotBoundException {
        new Client().do_the_work();
    }

    /** This is the client program part */
    private void do_the_work() throws IOException, NotBoundException {

        System.out.println("Client starting");

        // Find the server, and register with it
        System.out.println("Finding server");
        Object remObj =
                Naming.lookup("rmi://" + host + "/" + Command.REGISTER_NAME);
        System.out.println("Remote object is a " + remObj.getClass().getName());
        // System.out.println("It implements: ");
        // Arrays.asList(remObj.getClass().getInterfaces()).forEach(System.out::println);
        CommandProcessor server = (CommandProcessor)remObj;

        // Create a Command and send it to the server
        System.out.println("Sending a Command to the server");
        server.submit(() -> System.out.println("Hello world"));

        System.out.println("Command sent to server; look for output in server log.");

        System.exit(0);		// BG threads may otherwise keep client running.
    }
}