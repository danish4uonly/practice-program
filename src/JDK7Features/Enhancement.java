package JDK7Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Enhancement {
	
	public static void main(String[] args){
	
	//1. diamond operator 
	Map<String, List<String>> employeeRecords =  new HashMap<String, List<String>>();
	List<Integer> primes = new ArrayList<Integer>();

	//no need to defined in right side, before java 7 we have to define generics in both sides, while we are using collections.
	Map<String, List<String>> employeeRecords1 =  new HashMap<>();
	List<Integer> primes1 = new ArrayList<>();
	
	 //2) String in Switch
	 //Before JDK 7, only integral types  (byte, short, int and long) can be used as selector for switch-case statement. 
	//In JDK 7, you can use a String object as the selector. For example,

	 String state = "NEW";

	 switch (state) {
	    case "NEW": System.out.println("Order is in NEW state"); break;
	    case "CANCELED": System.out.println("Order is Cancelled"); break;
	    case "REPLACE": System.out.println("Order is replaced successfully"); break;
	    case "FILLED": System.out.println("Order is filled"); break;
	    default: System.out.println("Invalid");

	 }
	 
	 //3) Underscore in Numeric literals
	 int billion = 1_000_000_000;  // 10^9
	 long creditCardNumber =  1234_4567_8901_2345L; //16 digit number
	 long ssn = 777_99_8888L;
	 double pi = 3.1415_9265;
	 float  pif = 3.14_15_92_65f;
	 
	 //	 4) Catching Multiple Exception Type in Single Catch Block
	 
	 //previous :
	/* try {


		} catch(ClassNotFoundException ex) {
		   ex.printStackTrace();
		} catch(SQLException ex) {
		   ex.printStackTrace();
		}*/
	 
	 //now in 7 :
	 /*try {

		   ......

		} catch(ClassNotFoundException|SQLException ex) {

		   ex.printStackTrace();

		}*/

	}
}
