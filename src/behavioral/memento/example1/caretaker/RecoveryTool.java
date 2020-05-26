package behavioral.memento.example1.caretaker;

import java.util.ArrayList;
import java.util.List;

import behavioral.memento.example1.imagememento.RecoveryImage;

public class RecoveryTool {

	private List<RecoveryImage> images = new ArrayList<>();

	public void addImage(RecoveryImage image) {
		images.add(image);
	}

	public void deleteLastImage() {
		images.remove(images.size() - 1);
	}

	public RecoveryImage getLastWorkingImage() {
		return images.get(images.size() - 1);
	}

}
