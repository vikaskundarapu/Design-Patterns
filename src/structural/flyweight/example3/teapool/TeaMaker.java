package structural.flyweight.example3.teapool;

import java.util.EnumMap;
import java.util.Map;

import structural.flyweight.example3.Tea;

public class TeaMaker {

	private final Map<Tea.TEA_TYPE, Tea> teaPool = new EnumMap<>(Tea.TEA_TYPE.class);

	public Tea prepareTea(final Tea.TEA_TYPE teaType) {

		if (teaPool.containsKey(teaType)) {
			return teaPool.get(teaType);
		}

		Tea tea = new Tea(teaType);
		teaPool.put(teaType, tea);
		return tea;
	}
}
