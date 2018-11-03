package New;

import java.util.Arrays;

public class checking {
	
	public static void main(String[] args){
		A ab =new B(); //upcating
		//ab.method1();
		ab.method2();
		ab.method3();
		ab.method4();
		//ab.method5();
		
		System.out.println("------");
		
		B bb = (B) ab; //downcasting
		//bb.method1();
		bb.method2();
		bb.method3();
		bb.method4();
		bb.method5();
		
		System.out.println("---------");
		char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

	}
}

class A{
	/*A(){
		method1();
		method2();
		method3();
	}*/
	private void method1(){
		System.out.println("A");
	}
	public void method2(){
		System.out.println("AA");
	}
	public static void method3(){
		System.out.println("AAA");
	}
	
	public void method4(){
		System.out.println("AAAA");
	}
	
	public void throwMethod() throws ArithmeticException{
		
	}
	
}
class B extends A{
	private void method1(){
		System.out.println("B");
	}
	public void method2(){
		System.out.println("BB");
	}
	public static void method3(){
		System.out.println("BBB");
	}
	
	public void method5(){
		System.out.println("BBBBB");
	}
	public void throwMethod() throws NullPointerException{
		
	}
}//private and static method cannot be overridden, just method hiding take place


/*While overriding a method it can only throw checked exception declared by by overridden method or any subclass of it, 
means if overridden method throws IOExcpetion than overriding method can throw sub classes of 
IOExcpetion e.g. FileNotFoundException but not wider exception e.g. Exception or Throwable. 
This restriction is only for checked Exception for RuntimeException you can throw any RuntimeException. 
Overloaded method in Java doesn't have such restriction and you are free to modify throws clause as per your need.
*/


/*There are many rules if we talk about methodoverriding with exception handling. The Rules are as follows:

    If the superclass method does not declare an exception
        If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
    If the superclass method declares an exception
        If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
*/

class Parent{  
	  void msg()throws ClassNotFoundException{System.out.println("parent");}  
	}  
	  
	class TestExceptionChild2 extends Parent{  
	  void msg()throws ArithmeticException{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new TestExceptionChild2();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  