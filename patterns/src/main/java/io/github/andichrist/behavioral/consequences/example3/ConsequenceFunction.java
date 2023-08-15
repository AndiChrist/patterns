package io.github.andichrist.behavioral.consequences.example3;

import java.util.List;
import java.util.Map;

interface ConsequenceFunction {
  List<Object> getEvents(Map<String, Object> currentState);
}
