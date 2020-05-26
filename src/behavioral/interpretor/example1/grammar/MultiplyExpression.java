package behavioral.interpretor.example1.grammar;

public class MultiplyExpression implements Expression {

	private Expression first;
	private Expression second;

	public MultiplyExpression(Expression first, Expression last) {
		super();
		this.first = first;
		this.second = last;
	}

	@Override
	public int evaluate() {
		return first.evaluate() * second.evaluate();
	}

}
