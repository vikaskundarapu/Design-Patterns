package behavioral.interpretor.example1.grammar;

/*Concrete non-terminal expression */
public class AddExpression implements Expression {

	private Expression first;
	private Expression second;

	public AddExpression(Expression first, Expression last) {
		super();
		this.first = first;
		this.second = last;
	}

	@Override
	public int evaluate() {
		return first.evaluate() + second.evaluate();
	}

}
