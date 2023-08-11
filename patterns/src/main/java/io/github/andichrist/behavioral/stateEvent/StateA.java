package io.github.andichrist.behavioral.stateEvent;

class StateA implements State {
  @Override
  public void handleEvent(Context context, Event event) {
    if (event instanceof EventX) {
      System.out.println("Handling EventX in StateA");
      context.setState(new StateB());
    }
  }
}
