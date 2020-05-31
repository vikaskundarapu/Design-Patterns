package behavioral.templatemethod.example2;

public abstract class BuilderTool {

	/*
	 * This is the template method. Note the final keyword. Sub-classes should not
	 * be able to override this method.
	 */
	public final void build() {
		test();
		lint();
		assemble();
		deploy();
	}

	public abstract void test();

	public abstract void lint();

	public abstract void assemble();

	public abstract void deploy();
}
