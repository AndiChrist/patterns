package io.github.andichrist.behavioral.stateEvent;

class StateB implements State {
  @Override
  public void handleEvent(Context context, Event event) {
    if (event instanceof EventY) {
      System.out.println("Handling EventY in StateB");
      context.setState(new StateA());
    }
  }
}
