package New.ComparatorPackage2;

import java.util.Comparator;

/** LastNameSorter class is used to sort objects using employee lastName*/
public class LastNameSorter implements Comparator<Employee>{

	public int compare(Employee anEmployee, Employee anotherEmployee) {
		return anEmployee.getLastName().compareTo(anotherEmployee.getLastName());
	}
}