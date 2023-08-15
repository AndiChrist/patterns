package io.github.andichrist.behavioral.stateEvent.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Clojure:

 (defn update-state [current-state event]
   ;; return new state
   )

 (defn end-state [start-state events]
   (reduce update-state start-state events))
 */

public class StateUpdater {
  public Map<String, Object> updateState(Map<String, Object> currentState, Object event) {
    // Implement the logic to update the state based on the event
    // and return the new state as a new map
    // You can use methods from java.util.Map to create and modify the maps

    // For example:
    Map<String, Object> newState = new HashMap<>(currentState);
    newState.put("event", event);
    return newState;
  }

  public Map<String, Object> endState(Map<String, Object> startState, List<Object> events) {
    Map<String, Object> currentState = startState;

    for (Object event : events) {
      currentState = updateState(currentState, event);
    }

    return currentState;
  }
}
