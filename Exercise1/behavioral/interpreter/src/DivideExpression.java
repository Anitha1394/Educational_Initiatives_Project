package behavioral.interpreter.src;


public class DivideExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public DivideExpression(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret() {
        int divisor = rightExpression.interpret();
        if(divisor == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return leftExpression.interpret() / divisor;
    }
}
