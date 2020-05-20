package structural.flyweight.example3;

public class Tea {

	private final TEA_TYPE type;

	public Tea(TEA_TYPE type) {
		super();
		this.type = type;
	}

	public TEA_TYPE getType() {
		return type;
	}

	public enum TEA_TYPE {
		GREEN_TEA, BLACK_TEA, HERBAL_TEA, WHITE_TEA, FERMENTED_TEA
	};

}
