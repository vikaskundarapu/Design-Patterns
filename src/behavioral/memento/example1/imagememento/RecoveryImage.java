package behavioral.memento.example1.imagememento;

/**
 * Create a Memento class. In this case, the RecoveryImage class is the memento
 * which represents the object that can be saved and restored.
 */
public class RecoveryImage {

	private String image;

	public RecoveryImage(String image) {
		this.image = image;
	}

	public String getSystemImage() {
		return image;
	}
}
