package behavioral.memento.example2.client;

import behavioral.memento.example2.caretaker.ContentRecoveryTool;
import behavioral.memento.example2.editormemento.EditorMemento;
import behavioral.memento.example2.originator.Editor;

public class EditorMementoClient {

	public static void main(String[] args) {
		Editor editor = new Editor();

		/* Type two sentences */
		editor.type("This is the first sentence.");
		editor.type("This is the second sentence.");

		/* Create a caretaker and */
		ContentRecoveryTool recoveryTool = new ContentRecoveryTool();
		recoveryTool.addContent(editor.save());

		/* Add the third line */
		editor.type("This is the third sentence.");

		/* Content before saving */
		System.out.println(recoveryTool.getLastSavedContent());

		/* Save the content */
		recoveryTool.addContent(editor.save());

		/* Content after saving */
		System.out.println(recoveryTool.getLastSavedContent());

	}

}
