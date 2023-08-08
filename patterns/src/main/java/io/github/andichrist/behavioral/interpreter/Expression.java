package io.github.andichrist.behavioral.interpreter;

// Das abstrakte Ausdrucks-Interface
public interface Expression {
  int interpret(Context context);
}
