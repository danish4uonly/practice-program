package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class TestingString {
	
	public static void main(String[] args){
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee("101", "DanishJawed"));
		hs.add(new Employee("101", "DanishJawed"));
		hs.add(new Employee("101", "DanishJawed"));
		hs.add(new Employee("101", "DanishJawed"));	
		
		Employee e1 = new Employee("101", "DanishJawed");
		Employee e2 = new Employee("101", "DanishJawed");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		String s1 = "Danish";
		String s2 = "Danish";
		String s3 = new String("Danish");
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());  
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3)); 
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		s1.concat(" Jawed");
		System.out.println("String is immutable :"+s1);
		
		StringBuilder sb = new StringBuilder("Danish");
		sb.append(" Jawed");
		System.out.println("StringBuilder is mutable : "+sb);
		
		StringBuffer sb1 = new StringBuffer("Danish");
		sb1.append(" Jawed");
		System.out.println("StringBuffer is mutable : "+sb1);
		
	
	}
}

class Employee{
	
	private String empId;
	private String empName;
	
	public Employee(String empId, String empName){
		super();
		this.empId=empId;
		this.empName=empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
