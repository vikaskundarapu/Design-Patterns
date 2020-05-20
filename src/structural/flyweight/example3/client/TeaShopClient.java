package structural.flyweight.example3.client;

import structural.flyweight.example3.Tea.TEA_TYPE;
import structural.flyweight.example3.TeaShop;

/**
 * 
 * Real world example:
 * 
 * Did you ever have fresh tea from some tea shop? They often make more than one
 * cup that you demanded and save the rest for any other customer so to save the
 * resources e.g. gas etc. Flyweight pattern is all about that i.e. sharing.
 * 
 * In plain words: It is used to minimize memory usage or computational expenses
 * by sharing as much as possible with similar objects.
 * 
 * Wikipedia says: In computer programming, flyweight is a software design
 * pattern. A flyweight is an object that minimizes memory use by sharing as
 * much data as possible with other similar objects; it is a way to use objects
 * in large numbers when a simple repeated representation would use an
 * unacceptable amount of memory.
 * 
 */
public class TeaShopClient {

	public static void main(String[] args) {
		TeaShop shop = new TeaShop();
		shop.takeOrders(1, TEA_TYPE.BLACK_TEA);
		shop.takeOrders(2, TEA_TYPE.FERMENTED_TEA);
		shop.takeOrders(3, TEA_TYPE.HERBAL_TEA);

		shop.takeOrders(4, TEA_TYPE.WHITE_TEA);
		shop.takeOrders(5, TEA_TYPE.GREEN_TEA);
		shop.takeOrders(6, TEA_TYPE.HERBAL_TEA);
		shop.serveTea();
	}

}
