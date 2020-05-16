package structural.composite.example1.product;

/**
 * Create the leaf object that implements the interface.
 */
public class Gift implements GiftItem {

	private int id;

	private Gift() {
		super();
	}

	public Gift(int id) {
		super();
		this.id = id;
	}

	@Override
	public void printPackagingLevel(int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("--");
		}

		System.out.println("Gift " + id);
	}
}
