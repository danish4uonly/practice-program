package company.hp;



public class HP{
	
	
	//  1. ACID transactions 
	/**
		Q1.   {1,2,5,3,7,6,8,9,4}   rearrange such that odd will be left and even will be right
			//output : {1,5,3,7,9,2,6,8,4}
	
		Q2. Singleton thread safe implementation
	 * 
	 *  Q3. database connection jdbc.
	 *  
	 *  Q4. Equals  , hashcode, comparable with hashmap and hashtable  implementation full.
	 *  
	 *  Q5. Stack and Queue implementation and make it thread safe.
	 *  
	 *  Q6. File read write related question 
	 *  
	 *  Q7. java8 stream
	 *  
	 *  Q8. split a string based on space and tab and return the count of string.	 *
	 *  
	 *  Q9. Why spring boot?
	 *  
	 *  Q10. What is microservice and why?
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		int arr[] =  {22, 23, 18, 17, 15, 12, 4, 7, 9, 2};
		
		int n = arr.length;
	     
        rearrangeEvenAndOdd(arr, n);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    
		
	}
	
	// fuction is rearrange the array in given way.
    static void rearrangeEvenAndOdd(int arr[], int n)
    {
        // variables
        int j = -1,temp;
     
        // quick sort method
        for (int i = 0; i < n; i++) {
     
            // if array of element
            // is odd then swap
            if (arr[i] % 2 == 0) {
     
                // increment j by one
                j++;
     
                // swap the element
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}