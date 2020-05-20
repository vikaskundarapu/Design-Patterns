package structural.flyweight.example3;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.example3.teapool.TeaMaker;

public class TeaShop {
	private final TeaMaker maker;
	private final Map<Integer, Tea> orders;

	public TeaShop() {
		super();
		this.maker = new TeaMaker();
		orders = new HashMap<>();
	}

	public void takeOrders(int tableNumber, Tea.TEA_TYPE teaType) {
		orders.put(tableNumber, maker.prepareTea(teaType));
	}

	public void serveTea() {
		orders.forEach((tableNumber, tea) -> {
			System.out.println("Serving " + tea.getType() + " to table number " + tableNumber);
		});
	}
}
