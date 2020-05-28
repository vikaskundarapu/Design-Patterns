package behavioral.state.example2.context;

import behavioral.state.example2.state.DefaultTextState;
import behavioral.state.example2.state.WritingState;

public class TextEditor {

	private WritingState state;

	public TextEditor() {
		state = new DefaultTextState();
	}

	public void setState(WritingState state) {
		this.state = state;
	}

	public void typeSomething(String words) {
		state.write(words);
	}
}
