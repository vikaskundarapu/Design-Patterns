package structural.adapter.example2.adapter;

import structural.adapter.example2.WildDog;
import structural.adapter.example2.adaptee.Lion;

/**
 * Adapter around wild dog to make it compatible with our game
 */

public class WildDogAdapter implements Lion {

	private final WildDog dog = new WildDog();

	@Override
	public void roars() {
		dog.bark();
	}
}
