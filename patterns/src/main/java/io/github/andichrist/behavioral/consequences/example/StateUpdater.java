package io.github.andichrist.behavioral.consequences.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Clojure:

 (defn consequences [current-state event]
   ;; return a sequence of new events
   )

 (defn apply-consequences [current-state event]
   (reduce update-state current-state
           (consequences current-state event)))
 */
public class StateUpdater {
  public List<Object> consequences(Map<String, Object> currentState, Object event) {
    // Implement the logic to calculate and return a sequence of new events
    // based on the current state and the event

    // For example:
    List<Object> newEvents = new ArrayList<>();
    newEvents.add("new_event_1");
    newEvents.add("new_event_2");
    return newEvents;
  }

  public Map<String, Object> applyConsequences(Map<String, Object> currentState, Object event) {
    List<Object> newEvents = consequences(currentState, event);
    Map<String, Object> updatedState = currentState;

    for (Object newEvent : newEvents) {
      updatedState = updateState(updatedState, newEvent);
    }

    return updatedState;
  }

  public Map<String, Object> updateState(Map<String, Object> currentState, Object event) {
    // Implement the logic to update the state based on the event
    // and return the new state as a new map

    // For example:
    Map<String, Object> newState = new HashMap<>(currentState);
    newState.put("event", event);
    return newState;
  }
}

