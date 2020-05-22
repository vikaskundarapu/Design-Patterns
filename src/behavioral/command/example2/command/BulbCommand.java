package behavioral.command.example2.command;

public interface BulbCommand {

	public void execute();

	public void undo();

	public void redo();
}
