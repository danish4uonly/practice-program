import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class ReverseString {
	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
 
		// split to words by space
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
	
	public static String reverseStrings(String ss)
	{
        String sb= new StringBuffer(ss).reverse().toString();
        return sb;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
        System.out.println("Enter any String:");
        String ss=s.nextLine();
        
        System.out.println(reverseStrings(ss));
        
		String reverse = reverseWords(ss);
		System.out.println(reverse);
		
		String s3=new String("Sachin");
		System.out.println(s3);
		
		//convert string to int
		int n = Integer.parseInt("12");
		System.out.println(n);
		
		/*
		 * 
		 * Because immutable objects can not be changed, they can be shared among multiple threads freely. This eliminates the requirements of doing synchronization.

			In summary, String is designed to be immutable for the sake of efficiency and security. This is also the reason why immutable classes are preferred in general.

			String is not synchronized , since its immutable.
			StringBuffer is synchronized , since its mutable.
		 */
		String arr[] = {"a","b"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s1 = iter.next();
		 
			if (s1.equals("a")) {
				iter.remove();
			}
			System.out.println(s);
		}
		
		//convert array to arrayList and the arrayList to array to an array
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
		for (String s4 : stringArr)
			System.out.println(s4);
	}
	
	
	
}