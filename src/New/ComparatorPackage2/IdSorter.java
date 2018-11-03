package New.ComparatorPackage2;

import java.util.Comparator;

/** IdSorter class is used to sort objects using employee Id*/
public class IdSorter implements Comparator<Employee>{

	public int compare(Employee anEmployee, Employee anotherEmployee) {
		return anEmployee.getId().compareTo(anotherEmployee.getId());
	}
}
