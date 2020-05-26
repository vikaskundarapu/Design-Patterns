package behavioral.memento.example2.originator;

import behavioral.memento.example2.editormemento.EditorMemento;

public class Editor {

	private StringBuilder content;

	public Editor() {
		super();
		this.content = new StringBuilder();
	}

	public void type(String string) {
		content.append(" ");
		content.append(string);
	}

	public StringBuilder getContent() {
		return this.content;
	}

	public EditorMemento save() {
		return new EditorMemento(new StringBuilder(this.content));
	}

	public void restore(EditorMemento memento) {
		this.content = memento.getContent();
	}
}
