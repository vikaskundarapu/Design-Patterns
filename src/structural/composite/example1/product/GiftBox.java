package structural.composite.example1.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Create the composite object that implements the interface. A gift box can
 * contain a gift item or we can have another gift box inside it
 */
public class GiftBox implements GiftItem {

	private int id;
	private List<GiftItem> items = new ArrayList();

	public GiftBox(int id) {
		this.id = id;
	}

	public void addGift(GiftItem gift) {
		items.add(gift);
	}

	@Override
	public void printPackagingLevel(int level) {
		for (int i = 0; i < level; i++) {
			System.out.print("--");
		}
		System.out.println("Box " + id);
		for (GiftItem item : items) {
			item.printPackagingLevel(level + 1);
		}
	}

}
