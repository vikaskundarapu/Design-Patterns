package behavioral.iterator.example3;

public class RadioStation {

	private String frequency;

	public RadioStation(String frequency) {
		this.frequency = frequency;
	}

	public String getFrequency() {
		return this.frequency;
	}

	@Override
	public String toString() {
		return "RadioStation [frequency=" + frequency + "]";
	}

}
