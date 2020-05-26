package behavioral.interpretor.example1.grammar;

/*Concrete terminal expression */
public class IntegerValue implements Expression {

	private final int integerVal;

	public IntegerValue(int integerVal) {
		super();
		this.integerVal = integerVal;
	}

	@Override
	public int evaluate() {
		return integerVal;
	}

}
