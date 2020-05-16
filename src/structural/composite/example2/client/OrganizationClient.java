package structural.composite.example2.client;

import structural.composite.example2.Organization;
import structural.composite.example2.product.Developer;
import structural.composite.example2.product.Employee;
import structural.composite.example2.product.SalesExecutive;

/**
 * Every organization is composed of employees. Each of the employees has the
 * same features i.e. has a salary, has some responsibilities, may or may not
 * report to someone, may or may not have some subordinates etc.
 * 
 * In plain words, composite pattern lets clients treat the individual objects
 * in a uniform manner.
 * 
 * Wikipedia says: In software engineering, the composite pattern is a
 * partitioning design pattern. The composite pattern describes that a group of
 * objects is to be treated in the same way as a single instance of an object.
 * The intent of a composite is to "compose" objects into tree structures to
 * represent part-whole hierarchies. Implementing the composite pattern lets
 * clients treat individual objects and compositions uniformly.
 */
public class OrganizationClient {

	public static void main(String[] args) {
		Employee developer = new Developer("Vikas", 12000.0d, "Developer");
		Employee salesExecute = new SalesExecutive("Simran", 10000.0d, "Sales Executive");

		Organization organization = new Organization();
		organization.addEmployee(developer);
		organization.addEmployee(salesExecute);

		System.out.println(organization.getNetSalary());
	}

}
