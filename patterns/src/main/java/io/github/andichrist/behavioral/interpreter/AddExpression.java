package io.github.andichrist.behavioral.interpreter;

// Eine konkrete Implementierung des Ausdrucks für die Addition
public class AddExpression implements Expression {
  private Expression leftExpression;
  private Expression rightExpression;

  public AddExpression(Expression leftExpression, Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret(Context context) {
    return leftExpression.interpret(context) + rightExpression.interpret(context);
  }
}
