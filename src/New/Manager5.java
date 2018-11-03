package New;


public class Manager5{
	
	//Comparable and comparator Interface which is used to implement sorting in Java?
	//Ques :  “How you will sort Employee object based on his EmployeeID and his name”??

	/*Comparable interface is a member of java Collections framework present in java.lang package.
	Interface Comparable<T>
	T - the type of objects that this object may be compared to
	This interface imposes a total ordering on the objects of each class that implements it. 
	This ordering is referred to as the class's natural ordering, and the class's compareTo method is 
	referred to as its natural comparison method.
	
	only int compareTo(T o) method is there
	Compares this object with the specified object for order. Returns a negative integer, zero, or a 
	positive integer as this object is less than, equal to, or greater than the specified object. 
	*/
	
	/*The implementor must ensure sgn(x.compareTo(y)) == -sgn(y.compareTo(x)) for all x and y. (This implies that x.compareTo(y) must throw an exception iff y.compareTo(x) throws an exception.)

			The implementor must also ensure that the relation is transitive: (x.compareTo(y)>0 && y.compareTo(z)>0) implies x.compareTo(z)>0.

			Finally, the implementor must ensure that x.compareTo(y)==0 implies that sgn(x.compareTo(z)) == sgn(y.compareTo(z)), for all z.

			It is strongly recommended, but not strictly required that (x.compareTo(y)==0) == (x.equals(y)). Generally speaking, any class that implements the Comparable interface and violates this condition should clearly indicate this fact. The recommended language is "Note: this class has a natural ordering that is inconsistent with equals." 
	
	*/
	
	
	
	
	
	//Comparator
/*	Interface Comparator<T>
	T - the type of objects that may be compared by this comparator
	public interface Comparator<T>
	
	The ordering imposed by a comparator c on a set of elements S is said to be consistent 
	with equals if and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S
	
	int compare(T o1, T o2)
	Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first 
	argument is less than, equal to, or greater than the second.
	*/
	
	//vvv imp.
	//http://www.journaldev.com/780/comparable-and-comparator-in-java-example
	
	
	/*Comparable vs Comparator

    1. Comparable interface can be used to provide single way of sorting --->compareTo(o1)
    whereas Comparator interface is used to provide different ways of sorting. ---->> compare(o1, 02)
    
    2. For using Comparable, Class needs to implement it 
    whereas for using Comparator we don’t need to make any change in the class.
    
    3. Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
    
    4. We don’t need to make any code changes at client side for using 
    Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class. 
    For Comparator, client needs to provide the Comparator class to use in compare() method.
	*/
	
	
	/*@Override
    public int compare(Employee e1, Employee e2) {
        return (int) (e1.getSalary() - e2.getSalary());
        
        //return 0 means both salary are equal, positive means e1 salary is greater than e2 salary, negative means e2 > e1.
    }
	*/
	
	/*@Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
        //if string.
    }*/
	
	
	/*@Override
    public int compare(Employee o1, Employee o2) {
        int flag = o1.getId() - o2.getId();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
        
        //based on id and name we are sorting.
    }*/
	
	public static void main(String[] args){
		
	}

	

}
