package New;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//https://www.youtube.com/watch?v=-H0cHtZSics

/*
 * 1) If two objects are equal according to equals(object) method, then calling hashcode method on each
 * of the two objects must produce the same integer result.
 * 
 * 2)If two objects having the same hashcode then two objects may or may not be equal.
 */

public class HashMapDemo {
	
	public static void main(String[] args){
		
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee("101", "DanishJawed");
		Employee e2 = new Employee("101", "DanishJawed");
		Employee e3 = new Employee("101", "DanishJawed");
		Employee e4 = new Employee("101", "DanishJawed");
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);	
		
		System.out.println("Hash Code value: "+e1.hashCode()+"   "+e2.hashCode());
		System.out.println("equals check :"+e1.equals(e2));
		
		/*Employee e1 = new Employee("101", "DanishJawed");
		Employee e2 = new Employee("101", "DanishJawed");
		System.out.println(e1.equals(e2)); ---> true */
		
		/*String s1 = "Danish";
		String s2 = "Danish";
		String s3 = new String("Danish");
		System.out.println(s1.hashCode());  2039745389
		System.out.println(s3.hashCode());  2039745389
		//System.out.println(s1.equals(s2)); true
		System.out.println(s1.equals(s3)); true*/
		
		
		/*if we dont overide hash code and equals : As we know hashset does not allow duplicates when we are using primitive,
		but when we are user defined
		class as object into hashset it allow duplicates as we can see all the objects added to hash set are same,
		because having different hash code, so my intention to not to take duplicates, so overide equlas and hash code
		and write ur logics on that.
		I am writing empId in hashCode method 101 empId common for all four objects of employee, so calculating hashcode will be same for all.
		*/
		
		/*
		 * below equlas and hashcode method : if u comment one and uncomment other then also u will be getting duplicate objects of employee class.
		 *-----uncomment both then u will be getting unique results.
		 */
		//So whenever you are using HashSet, HashMap and HashTable , overide both method
		//As HashSet internally using HashMap and HashMap internally using hashCode and equals method. so thats why we overide.
		
		//System.out.println(hs);
		System.out.println("HashSet :");
		for(Employee e : hs){
			System.out.println(" emp id : " + e.getEmpId() + " emp name : " + e.getEmpName() + " hash code : " + e.hashCode());
		}
		
		System.out.println("HashMap :");
		
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(new Employee("101", "DanishJawed"), "Testing1");
		hm.put(new Employee("101", "DanishJawed"), "Testing1");
		hm.put(new Employee("101", "DanishJawed"), "Testing1");
		hm.put(new Employee("101", "DanishJawed"), "Testing1");
		
		//System.out.println(hm);
		
		for(Map.Entry<Employee, String> map : hm.entrySet()){
			System.out.println(" key : " + map.getKey() + " value : " + map.getValue() + " hash code : " + map.getKey().hashCode());
		}
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
        int result = 1;
        result = prime * result + ((empId == null) ? 0 : empId.hashCode());
        //result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        //System.out.println(result);
        return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Employee other = (Employee) obj;
        if (empId == null) {
            if (other.empId != null)
                return false;
        } else if (!empId.equals(other.empId))
            return false;
        if (empName == null) {
            if (other.empName != null)
                return false;
        } else if (!empName.equals(other.empName))
            return false;
        return true;
	}
	
	//or
	//it is checking for both empId and empName , if both are equal then only we consider it is same object.
	//in above equals we are checking only for id not for name but we can write for name also. depends on our logic
	/*@Override
	public boolean equals(Object obj) {		
		if (!(obj instanceof Employee))
			return false;
		if (obj == this)
			return true;
		return this.empId == ((Employee) obj).empId && 
				this.empName == ((Employee) obj).empName;
	}*/
}
