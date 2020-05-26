package behavioral.interpretor.example1.client;

import java.util.Stack;

import behavioral.interpretor.example1.grammar.AddExpression;
import behavioral.interpretor.example1.grammar.DivideExpression;
import behavioral.interpretor.example1.grammar.Expression;
import behavioral.interpretor.example1.grammar.IntegerValue;
import behavioral.interpretor.example1.grammar.MultiplyExpression;
import behavioral.interpretor.example1.grammar.SubtractExpression;

/**
 * When to use: To easily solve 'repeated' problems in a 'well-defined' domain
 * with the help of a 'language'.
 * 
 * Intent: Given a language, define a representation for its grammar along with
 * an interpreter that uses the representation to interpret sentences in the
 * language.
 * 
 * Implementation: Here we see an example of evaluating arithmetic expressions
 * using the Interpreter pattern. The representation is defined as POSTFIX and
 * the grammar is defined to interpret different type of expressions. Though
 * each expression is different, they are all constructed using the basic rules
 * that make up the grammar for the language of arithmetic expressions.
 *
 * Below is the client code. The client uses an abstract syntax tree
 * representing a particular sentence in the language that the grammar defines.
 * The abstract syntax tree is assembled from instances of the
 * NonterminalExpression and TerminalExpression classes. The client then invokes
 * the Interpret operation.
 */
public class InterpreterClient {

	public static void main(String[] args) {
		/* POSTFIX Expression to be evaluated */
		String postfix = "543-2+*";

		/* Operations supported */
		final String OPERATORS = "+-*/";

		/* Stack for the operands */
		Stack<Expression> stack = new Stack<>();

		for (char character : postfix.toCharArray()) {
			Expression expression;

			if (OPERATORS.indexOf(character) == -1) {
				/* number found, push it onto the stack */
				expression = new IntegerValue(character - 48);// 48 is the ASCII of zero
			} else {
				/*
				 * operator found, pop out the last two operands from the stack and perform the
				 * operation
				 */
				Expression right = stack.pop();
				Expression left = stack.pop();

				switch (character) {
				case '+':
					expression = new AddExpression(left, right);
					break;
				case '-':
					expression = new SubtractExpression(left, right);
					break;
				case '*':
					expression = new MultiplyExpression(left, right);
					break;
				case '/':
					expression = new DivideExpression(left, right);
					break;

				default:
					expression = new IntegerValue(0);
				}
			}
			/* push the result onto the stack */
			stack.push(new IntegerValue(expression.evaluate()));
		}
		System.out.println("Result: " + stack.pop().evaluate());
	}

}
