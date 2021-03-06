package application;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<Employee>();
		System.out.print("How many employee will be register: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(hasId(listEmployee, id)) {
				System.out.println("Idalready taken!");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			listEmployee.add(new Employee(id, name, salary));
		}

		System.out.println("Enter the employee id that will have increase salary: ");
		Integer id = sc.nextInt();

		Employee emp = listEmployee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println("List of Employees: ");
		for (Employee employee : listEmployee) {
			System.out.println(employee);
		}

		sc.close();
	}

	public static Boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return emp!=null;
	}
}
