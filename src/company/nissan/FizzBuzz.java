package company.nissan;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		System.out.println("Type in two different line :");
		//Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        String name1 = s.nextLine(); 
   
        int count = Integer.parseInt(name);	
        int[] array = Arrays.stream(name1.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for(int n=0; n < array.length; n++){
            for (int i=1; i<=array[n]; i++){
            	if (i%15==0)                                                    
            		System.out.println("FizzBuzz"); 
	            // number divisible by 5, print 'Buzz' 
	            // in place of the number
	            else if (i%5==0)     
	                System.out.println("Buzz"); 
	 
	            // number divisible by 3, print 'Fizz' 
	            // in place of the number
	            else if (i%3==0)     
	                System.out.println("Fizz");    
 
	            // number divisible by 15(divisible by
	            // both 3 & 5), print 'FizzBuzz' in 
	            // place of the number
             
	            else  // print the numbers
	                System.out.println(i);                          
            }
        }
	}
}

/*
 IMPORTANT: Multiple classes and nested static classes are supported 


 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
         Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReaderA br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        String name1 = s.nextLine(); 
        System.out.println("Hi, " + name1 + ".");

      
        
        
        // Write your code here
        int[] j  = {2, 3 , 15};
        
        for(int n=0; n<j.length; n++){
            
            if(n==1){
                System.out.println("Fizz"+" "); 
            }
            
            if(n!=1){
            for (int i=1; i<=j[n]; i++)                                    
        {
            if (i%15==0)                                                    
                System.out.println("FizzBuzz"); 
            // number divisible by 5, print 'Buzz' 
            // in place of the number
            else if (i%5==0)     
                System.out.println("Buzz"); 
 
            // number divisible by 3, print 'Fizz' 
            // in place of the number
            else if (i%3==0)     
                System.out.println("Fizz");    
 
            // number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in 
            // place of the number
             
                
            else  // print the numbers
                System.out.println(i);                          
        }
            }
        }
        
        
        

    }
    
    public static void test(int n){
        // loop for 100 times
        for (int i=1; i<=n; i++)                                    
        {
            // number divisible by 5, print 'Buzz' 
            // in place of the number
            if (i%5==0)     
                System.out.print("Buzz"+" "); 
 
            // number divisible by 3, print 'Fizz' 
            // in place of the number
            else if (i%3==0)     
                System.out.print("Fizz");    
 
            // number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in 
            // place of the number
            else if (i%15==0)                                                    
                System.out.println("FizzBuzz");  
                
            else  // print the numbers
                System.out.print(i+" ");                          
        }
    }
}*/