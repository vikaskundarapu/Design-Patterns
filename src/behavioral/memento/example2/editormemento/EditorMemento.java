package behavioral.memento.example2.editormemento;

public class EditorMemento {

	private StringBuilder content = new StringBuilder();

	public EditorMemento(StringBuilder content) {
		this.content = content;
	}

	public StringBuilder getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "EditorMemento [content=" + content + "]";
	}

}
