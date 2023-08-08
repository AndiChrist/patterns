package io.github.andichrist.other.remotecommand.server;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import io.github.andichrist.other.remotecommand.Command;

/*
 * Server that accepts client Command objects and runs them.
 */
public class Server {

    protected final static String host = "localhost";

    /** No-argument constructor required as we are a Remote Object */
    public Server() throws RemoteException {
        // Empty
    }

    /** This is the main program, just to get things started. */
    public static void main(String[] argv) throws IOException, NotBoundException {

        // Instantiate and register the service object
        System.out.println("Server instance starting");

        // First, register us with the RMI registry
        Naming.rebind(Command.REGISTER_NAME, new CommandProcessorImpl());

        // We don't want the arbitrary code to be too arbitrary...
        //System.setSecurityManager(new SecurityManager());

        System.out.println("Server program bound.");
    }
}