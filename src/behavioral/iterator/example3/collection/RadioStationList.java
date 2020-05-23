package behavioral.iterator.example3.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import behavioral.iterator.example3.RadioStation;

public class RadioStationList implements Iterator<RadioStation> {

	private List<RadioStation> radioStations = new LinkedList<>();

	public void addRadioStation(RadioStation radioStation) {
		radioStations.add(radioStation);
	}

	@Override
	public boolean hasNext() {
		return !radioStations.isEmpty();
	}

	@Override
	public RadioStation next() {

		if (!hasNext()) {
			throw new NoSuchElementException("EmptyList");
		}

		return radioStations.remove(0);
	}
}
