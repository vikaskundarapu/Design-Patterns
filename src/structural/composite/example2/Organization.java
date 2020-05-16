package structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

import structural.composite.example2.product.Employee;

public class Organization {

	private final List<Employee> employees;

	public Organization() {
		employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public double getNetSalary() {
		return employees.stream().map(Employee::getSalary).reduce(0.0d, (i, j) -> i + j);
	}

}
