package io.github.andichrist.other.remotecommand;

import java.rmi.*;

public interface CommandProcessor extends Remote {

    void submit(Command c);
}