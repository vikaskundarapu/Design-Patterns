package behavioral.memento.example2.caretaker;

import behavioral.memento.example2.editormemento.EditorMemento;

public class ContentRecoveryTool {

	private EditorMemento editorMemento;

	public void addContent(EditorMemento editorMemento) {
		this.editorMemento = editorMemento;
	}

	public EditorMemento getLastSavedContent() {
		return editorMemento;
	}
}
