package behavioral.iterator.example3.client;

import behavioral.iterator.example3.RadioStation;
import behavioral.iterator.example3.collection.RadioStationList;

/**
 * Real world example: An old radio set will be a good example of iterator,
 * where user could start at some channel and then use next or previous buttons
 * to go through the respective channels. Or take an example of MP3 player or a
 * TV set where you could press the next and previous buttons to go through the
 * consecutive channels or in other words they all provide an interface to
 * iterate through the respective channels, songs or radio stations.
 * 
 * In plain words: It presents a way to access the elements of an object without
 * exposing the underlying presentation.
 * 
 * Wikipedia says: In object-oriented programming, the iterator pattern is a
 * design pattern in which an iterator is used to traverse a container and
 * access the container's elements. The iterator pattern decouples algorithms
 * from containers; in some cases, algorithms are necessarily container-specific
 * and thus cannot be decoupled.
 */
public class RadioStationClient {

	public static void main(String[] args) {
		RadioStationList radioStationList = new RadioStationList();
		radioStationList.addRadioStation(new RadioStation("93.5"));
		radioStationList.addRadioStation(new RadioStation("98.7"));
		radioStationList.addRadioStation(new RadioStation("92.5"));
		
		while(radioStationList.hasNext()) {
			System.out.println(radioStationList.next());
		}
	}

}
