class A
{
	int a=10;
	int aa=50;  //http://javabypatel.blogspot.com/2017/08/what-is-polymorphism-in-java-with-example.html
	
	public void TestA()
	{
		System.out.println("TestA A");
	}
	
	public void TestAA()
	{
		System.out.println("TestAA AA");
	}
	
	// Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
}

class B extends A
{
	int a= 20;
	int bb=60;
	public void TestA()
	{
		System.out.println("TestA B");
	}
	
	public void TestB()
	{
		System.out.println("TestB B");
	}
	
	// This method hides display() in Base 
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
}

public class Poly
{
	public static void main(String[] args)
	{
		/*B b = new B();
		A a = new A();
		
		a.TestA();
		b.TestA();
		b.TestB();*/
		
		/*B b1 = (B) new A();
		b1.TestA();
		b1.TestB();*/
		
		A a1 = new B();//upcasting
		/*A a1 = (A) new B();*/ //both same
		a1.TestA();
		a1.TestAA();
		//a1.TestB(); error
		
		// As per overriding rules this should call to class Derive's static 
	       // overridden method. Since static method can not be overridden, it 
	       // calls Base's display() 
	       a1.display();  
		
		B b1 = (B) a1;//downcasting
		b1.TestA();
		b1.TestAA();
		b1.TestB();
		b1.display();
		
		/**
		 * In Java, we can override methods only, not the variables(data members),
		 *  so runtime polymorphism cannot be achieved by data members. For example :
		 */
		System.out.println("** a value : "+a1.a);
		System.out.println("** a value : "+a1.aa);
		//System.out.println("** a value : "+a1.bb);
		System.out.println("** a value : "+b1.a);
		System.out.println("** a value : "+b1.bb);
		System.out.println("** a value : "+b1.aa);
		
		B b3 = new B();
		A a3 = b3;
		a3.TestA();
		
		
		
		/*B b = new B();
		b.TestA();
		b.TestB();*/
		
	}
}