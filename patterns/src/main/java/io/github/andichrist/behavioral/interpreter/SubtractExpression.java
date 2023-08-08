package io.github.andichrist.behavioral.interpreter;

// Eine konkrete Implementierung des Ausdrucks für die Subtraktion
public class SubtractExpression implements Expression {
  private Expression leftExpression;
  private Expression rightExpression;

  public SubtractExpression(Expression leftExpression, Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret(Context context) {
    return leftExpression.interpret(context) - rightExpression.interpret(context);
  }
}
