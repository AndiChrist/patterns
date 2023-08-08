package io.github.andichrist.behavioral.interpreter;

// Eine konkrete Implementierung des Ausdrucks für Zahlen
public class NumberExpression implements Expression {
  private int number;

  public NumberExpression(int number) {
    this.number = number;
  }

  @Override
  public int interpret(Context context) {
    return number;
  }
}
