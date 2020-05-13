package structural.adapter.example2.client;

import structural.adapter.example2.Hunter;
import structural.adapter.example2.adaptee.AfricanLion;
import structural.adapter.example2.adaptee.AsiaticLion;
import structural.adapter.example2.adaptee.Lion;
import structural.adapter.example2.adapter.WildDogAdapter;

/**
 * Consider a game where there is a hunter and he hunts lions. First we have an
 * interface Lion that all types of lions have to implement. And hunter expects
 * any implementation of Lion interface to hunt.
 * 
 * Now let's say we have to add a WildDog in our game so that hunter can hunt
 * that also. But we can't do that directly because dog has a different
 * interface. To make it compatible for our hunter, we will have to create an
 * adapter that is compatible.And now the WildDog can be used in our game using
 * WildDogAdapter.
 * 
 */
public class HunterGameClient {

	public static void main(String[] args) {
		Lion asiaticLion = new AsiaticLion();

		Lion africanLion = new AfricanLion();
		africanLion.roars();

		Lion wildDog = new WildDogAdapter();

		Hunter hunter = new Hunter();
		hunter.hunt(asiaticLion);
		hunter.hunt(wildDog);

	}

}
