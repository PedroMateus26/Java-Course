package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}

	public double increaseSalary(double percent) {
		return this.salary += this.salary * percent/100;
	}
	
	public String toString() {
		return this.id
				+", "
				+this.name
				+", "
				+this.salary;
	}
}
