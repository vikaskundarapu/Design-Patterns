package structural.composite.example1.client;

import structural.composite.example1.product.Gift;
import structural.composite.example1.product.GiftBox;
import structural.composite.example1.product.GiftItem;

/**
 * A typical example is the File system which contains directories and files. A
 * directory can contain files or sub-directories but both have to be handled in
 * the same way.
 * 
 * In the following example, gift boxes and gift items are implemented using the
 * Composite pattern. A box can contain many gift items and contains a smaller
 * gift boxes. We need a common way to interact with both entities.
 */
public class GiftBoxClient {

	public static void main(String[] args) {

		// initialize the gifts
		GiftItem gift1 = new Gift(1);
		GiftItem gift2 = new Gift(2);
		GiftItem gift3 = new Gift(3);
		GiftItem gift4 = new Gift(4);

		// Initialize gift boxes
		GiftBox giftBox1 = new GiftBox(1);
		GiftBox giftBox3 = new GiftBox(3);
		GiftBox giftBox2 = new GiftBox(2);

		// Add 3 gifts to gift box 1
		giftBox1.addGift(gift1);
		giftBox1.addGift(gift2);
		giftBox1.addGift(gift3);

		// Add 4th gift to gift box 2
		giftBox2.addGift(gift4);

		giftBox3.addGift(giftBox2);
		giftBox3.addGift(giftBox1);

		giftBox3.printPackagingLevel(0);
	}

}
