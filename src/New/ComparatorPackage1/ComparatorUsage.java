package New.ComparatorPackage1; 

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsage {
    public static void main(String[] args) {
 
        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("brad","1");

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new Employee().new ComparatorName());
        System.out.println("\nlist after sorting on basis of name(ascending order), "
                  + "using inner class : \n"+ list);
 
        Collections.sort(list,new Employee.ComparatorId());
        System.out.println("\nlist after sorting on basis of id(ascending order), "
                  + "using static inner class : \n"+list);
    }
    
  /*  Collections.sort(persons, new Comparator() {

        public int compare(Object o1, Object o2) {

            String x1 = ((Person) o1).getName();
            String x2 = ((Person) o2).getName();
            int sComp = x1.compareTo(x2);

            if (sComp != 0) {
               return sComp;
            } else {
               Integer x1 = ((Person) o1).getAge();
               Integer x2 = ((Person) o2).getAge();
               return x1.compareTo(x2);
            }
    }});*/
    
/*    ComparatorName (inner class of Employee class) and ComparatorId (static inner class of Employee class) are two classes which will implement Comparator to provide sorting on basis of name and id respectively.


    How to use inner and static inner class?
    For accessing non-static inner class we need to create instance of top level class and then instance of inner class.
    For accessing static inner class we need not to create instance of top level class neither of static inner class.


    new Employee().new ComparatorName()  >using non static inner class 
    new Employee  .    ComparatorId()    >using static inner class*/
}