package behavioral.state.example2.state;

public class DefaultTextState implements WritingState {

	@Override
	public void write(String words) {
		System.out.println(words);
	}

}
