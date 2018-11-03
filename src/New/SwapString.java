package New;

//swap string without using third variable.
//ASK in JDA
public class SwapString {
	
	int a=10; //non static variable
	static int b=20;//static variable
	
	public static void main(String[] args){
		String s1="Danish";
		String s2="Jawed";
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
		
		
		
		staticMethod();
		
		SwapString ss = new SwapString();
		ss.nonStaticMethod();
	}
	
	//we cannot access non static variable in static context?
	
	public static void staticMethod(){
		System.out.println(b);
		//System.out.println(a); won't compile
		
		SwapString ss = new SwapString();
		System.out.println(ss.a);//this will work
	}
	
	public void nonStaticMethod(){
		System.out.println(b);
		System.out.println(a);
	}
}
