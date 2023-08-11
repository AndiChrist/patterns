package io.github.andichrist.behavioral.stateEvent;

// Kontext oder Zustandsautomat
class Context {
  private State currentState;

  public Context() {
    currentState = new StateA();
  }

  public void setState(State state) {
    currentState = state;
  }

  public void handleEvent(Event event) {
    currentState.handleEvent(this, event);
  }
}
