package company.barclays;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSetTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Danish", "7411391779");
		Employee emp2 = new Employee(1, "Danish", "7411391779");

		System.out.println(emp1.equals(emp2));
		
		Set<Employee> hs = new HashSet<>();
		
		hs.add(emp1);
		hs.add(emp2);
		
		System.out.println(hs.size());
		
		for(Employee e : hs){
			System.out.println(e.getId()+" "+e.getName()+" "+e.getPhone());
		}
	}

}
