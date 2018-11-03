package New.ComparatorPackage2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee emp1 = new Employee("1", "prasad", "kharkar");
		Employee emp2 = new Employee("5", "Aniket", "Kulkarni");
		Employee emp3 = new Employee("3", "Kaustubh", "pande");
		Employee emp4 = new Employee("4", "Pranil", "Gilda");
		Employee emp5 = new Employee("2", "Nilesh", "Deshmukh");

		List<Employee> employees = new ArrayList<Employee>();
		EmployeeSort employeeSort = new EmployeeSort();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		System.out.println("Unsorted employees");
		employeeSort.printEmployeeDetails(employees);
		Collections.sort(employees, new IdSorter());
		System.out.println("employees sorted using id");
		employeeSort.printEmployeeDetails(employees);
		System.out.println("employees sorted using first name");
		Collections.sort(employees, new FirstNameSorter());
		employeeSort.printEmployeeDetails(employees);
		System.out.println("employees sorted using last name");
		Collections.sort(employees, new LastNameSorter());
		employeeSort.printEmployeeDetails(employees);

	}

	public void printEmployeeDetails(List<Employee> employees){
		for(Employee employee : employees){
			System.out.println(employee);
		}
	}

}
