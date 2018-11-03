package company.fico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CustomObjectHashSet {

	public static void main(String a[]){
       
        HashSet<Empll> nameComp = new HashSet<Empll>();        
        nameComp.add(new Empll("Ram",3000));
        nameComp.add(new Empll("Ram",3000)); 
        nameComp.add(new Empll("John",6000));
        nameComp.add(new Empll("Crish",2000));
        nameComp.add(new Empll("Tom",2400));
        
        List<Empll> sortedList = new ArrayList(nameComp);
        Collections.sort(sortedList, new MyNameComp1());
        
    /* // Sorting HashSet using TreeSet
        TreeSet<Empll> sorted = new TreeSet<Empll>(nameComp);*/

        
        for(Empll e : sortedList){
            System.out.println(e);
        }
    }
}
 
class MyNameComp1 implements Comparator<Empll>{
 
    @Override
    public int compare(Empll e1, Empll e2) {
        return e1.getName().compareTo(e2.getName());
    }
} 
 /**
class MySalaryComp1 implements Comparator<Empll>{
 
    @Override
    public int compare(Empll e1, Empll e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}*/
 
class Empll{
     
    private String name;
    private int salary;
     
    public Empll(String n, int s){
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
    
    @Override
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
    }
    
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}
