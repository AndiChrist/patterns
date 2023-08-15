package io.github.andichrist.behavioral.consequences.example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 (defn chain-consequences [initial-state consequence-fns]
   (loop [state initial-state
          fs consequence-fns
          output []]
     (if (seq fs)
       (let [events ((first fs) state)
             new-state (reduce update-state state events)]
         (recur new-state (rest fs) (into output events)))
       output)))
 */
public class StateUpdater {
  public Map<String, Object> chainConsequences(Map<String, Object> initialState, List<ConsequenceFunction> consequenceFunctions) {
    return applyChainConsequences(initialState, consequenceFunctions, new ArrayList<>());
  }

  private Map<String, Object> applyChainConsequences(Map<String, Object> currentState, List<ConsequenceFunction> consequenceFunctions, List<Object> output) {
    if (!consequenceFunctions.isEmpty()) {
      ConsequenceFunction firstFunction = consequenceFunctions.get(0);
      List<Object> events = firstFunction.getEvents(currentState);
      Map<String, Object> newState = applyConsequences(currentState, events);

      List<ConsequenceFunction> remainingFunctions = consequenceFunctions.subList(1, consequenceFunctions.size());

      return applyChainConsequences(newState, remainingFunctions, addToOutput(output, events));
    } else {
      return currentState;
    }
  }

  private Map<String, Object> applyConsequences(Map<String, Object> currentState, List<Object> events) {
    // Implement the logic to calculate and return the updated state based on events

    // For example:
    Map<String, Object> newState = new HashMap<>(currentState);
    for (Object event : events) {
      newState = updateState(newState, event);
    }
    return newState;
  }

  private List<Object> addToOutput(List<Object> output, List<Object> events) {
    output.addAll(events);
    return output;
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
