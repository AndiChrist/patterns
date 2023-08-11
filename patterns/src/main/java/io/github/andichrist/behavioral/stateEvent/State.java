package io.github.andichrist.behavioral.stateEvent;

// Zustandsübergänge
interface State {
  void handleEvent(Context context, Event event);
}
