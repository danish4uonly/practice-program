package company.fico;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;


public class TreeMapCustomObject {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<>(0);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		
		
		
		TreeMap<Employee, String> tm = new TreeMap<>();
		tm.put(new Employee("Test",1), "A");
		tm.put(new Employee("Test",1), "A");
		tm.put(new Employee("Test",1), "A");

	}

}

class EmployeeNameComp implements Comparator<Employee>{
	 
    @Override
    public int compare(Employee e1, Employee e2) {
    	return e1.getName().compareTo(e2.getName());
    }
}

class Employee implements Comparable<Employee>{
    
    private String name;
    private int salary;
     
    public Employee(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    /**@Override
    public boolean equals(Object obj) {
    	
    	if (obj == null) {
	           return false;
	       }
	       if (getClass() != obj.getClass()) {
	           return false;
	       }
	       final Empll other = (Empll) obj;
	       if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
    }
    
    @Override
    public int hashCode() {
    	return 31 * this.name.hashCode();
    }*/
    
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }

	

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
