package behavioral.state.example2.client;

import behavioral.state.example2.context.TextEditor;
import behavioral.state.example2.state.LowerCaseState;
import behavioral.state.example2.state.UpperCaseState;

/**
 * Real world example: Imagine you are using some drawing application, you
 * choose the paint brush to draw. Now the brush changes its behavior based on
 * the selected color i.e. if you have chosen red color it will draw in red, if
 * blue then it will be in blue etc.
 * 
 * In plain words: It lets you change the behavior of a class when the state
 * changes.
 * 
 * Wikipedia says: The state pattern is a behavioral software design pattern
 * that implements a state machine in an object-oriented way. With the state
 * pattern, a state machine is implemented by implementing each individual state
 * as a derived class of the state pattern interface, and implementing state
 * transitions by invoking methods defined by the pattern's superclass. The
 * state pattern can be interpreted as a strategy pattern which is able to
 * switch the current strategy through invocations of methods defined in the
 * pattern's interface.
 * 
 * Programmatic example: Let's take an example of text editor, it lets you
 * change the state of text that is typed i.e. if you have selected bold, it
 * starts writing in bold, if italic then in italics etc.
 */
public class TextEditorClient {

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		textEditor.typeSomething("Default text without any modifications");

		textEditor.setState(new UpperCaseState());
		textEditor.typeSomething("This should be printed in uppercase");

		textEditor.setState(new LowerCaseState());
		textEditor.typeSomething("This should be printed in lowercase");
	}

}
