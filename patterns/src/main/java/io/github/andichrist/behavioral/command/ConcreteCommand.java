package io.github.andichrist.behavioral.command;

// Die konkrete Implementierung des Kommandos
public class ConcreteCommand implements Command {
  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.performAction();
  }
}
