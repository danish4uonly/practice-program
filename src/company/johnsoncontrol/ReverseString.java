package company.johnsoncontrol;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		// Function calling
		int arr[] = {1, 2, 3, 4, 5, 6};
		reverseIntegerArray(arr, 0, arr.length-1);
	    printIntegerArray(arr);
	   
	    System.out.println();
	    
	    String s1 = "DanishJawed";
	    char[] charArray = s1.toCharArray();
	    reverseStringArray(charArray, 0, charArray.length - 1);
	    printStringArray(charArray);
	    
	    System.out.println();
	    String ss = Arrays.toString(charArray);
	    System.out.println(ss);
	    
	    
	    String st = "";
	    for(int i = s1.length() - 1; i >= 0; i--){
	    	st = st+s1.charAt(i);
	    }
	    System.out.println(st);
	    
	    //or below:
	    
	    /*System.out.println();
	    System.out.println(charArray.length);
	    System.out.println(charArray.length/2);*/
	    
        /*int len=charArray.length;
        for (int i = 0; i < charArray.length/2; i++) {
            char aa=charArray[i];
            charArray[i]=charArray[len-i-1];
            charArray [len-i-1]=aa;
        }
        System.out.println();
        for(int i =0; i<charArray.length; i++){
        	System.out.print(charArray[i]);
        }*/
	    
	  //convert int to int array.
	  /* int a = 123456;
	    String temp = Integer.toString(a);
	    //char[] aa = temp.toCharArray();
	    int[] newGuess = new int[temp.length()];
	    for (int i = 0; i < temp.length(); i++)
	    {
	        newGuess[i] = temp.charAt(i) - '0';
	    }*/
	    
	    
	    String str = "Welcome to Beginnersbook";
	    String str1 = "Danish";
	    System.out.println(str1.substring(5));
	    System.out.println(str1.substring(1,3));
	    System.out.println(str1.subSequence(1, 6));
        String reversed = reverseString1(str1);
        System.out.println("The reversed string is: " + reversed);
	}
	
	public static void reverseStringArray(char arr[], int start, int end)
	{
		while(start < end){
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	
	//Time Complexity : O(n)
	/* Function to reverse arr[] from start to end*/
	public static void reverseIntegerArray(int arr[], int start, int end)
	{
		//or //for (int i = 0; i < arr.length/2; i++) 
	    while (start < end)
	    {
	        int temp = arr[start]; 
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    } 
	}  
	
	/* Utility function to print an array */
	public static void printIntegerArray(int arr[])
	{
	   for (int i = 0; i < arr.length; i++){
		   System.out.print(arr[i]+" ");
	   }
	} 
	
	/* Utility function to print an array */
	public static void printStringArray(char arr[])
	{
	   for (int i = 0; i < arr.length; i++){
		   System.out.print(arr[i]+" ");
	   }	   
	} 
	
	public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
	
	static String reverse = "";
    
    public static String reverseString1(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1) + reverseString1(str.substring(0,str.length()-1));
            return reverse;
        }
    }
}
