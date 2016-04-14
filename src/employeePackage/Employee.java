package employeePackage;

public class Employee extends Person {
	
	private double Salary;

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public void printName() {
		System.out.println(getLastName() + "," + getFirstName());
	}
}
