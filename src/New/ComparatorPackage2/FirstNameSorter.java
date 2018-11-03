package New.ComparatorPackage2;

import java.util.Comparator;

/** FirstNameSorter class is used to sort objects using employee firstName*/

public class FirstNameSorter implements Comparator<Employee> {

	public int compare(Employee anEmployee, Employee anotherEmployee) {
		return anEmployee.getFirstName().compareTo(anotherEmployee.getFirstName());
	}
}