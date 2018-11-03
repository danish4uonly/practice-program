package java2novice;

public class StringReverseRecursive {
	
	//Program: Write a program to reverse a string using recursive algorithm.
	
	public static void main(String[] args){
		
		System.out.println("Result: "+reverseString("Danish Jawed"));
		int i=10;
		Integer it = new Integer(i);//boxing - converting primitive to wrapper object
		Integer iaa=Integer.valueOf(i);//converting int into Integer  
		System.out.println(it);
		int ival=it.intValue();//unboxing - converting wrapper object to primitive
		System.out.println(ival);
		
		Integer itval=i;//auto boxing
		System.out.println(itval);
		int ivalnew =itval;//auto unboxing
		System.out.println(ivalnew);
		
		String s1="100";
		int s1val=Integer.parseInt(s1);
		System.out.println(s1val);
		double d1=Double.parseDouble(s1);
		String sval=Integer.toString(s1val);
		System.out.println(sval);
	}
	
	public static String reverseString(String str){
        String reverse="";
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

}
