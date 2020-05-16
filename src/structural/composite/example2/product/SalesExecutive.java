package structural.composite.example2.product;

public class SalesExecutive implements Employee {

	private final String name;
	private final double salary;
	private final String role;

	public SalesExecutive(String name, double salary, String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public String getRole() {
		return role;
	}

}
