package behavioral.state.example2.state;

public class LowerCaseState implements WritingState {

	@Override
	public void write(String words) {
		System.out.println(words.toLowerCase());
	}

}
