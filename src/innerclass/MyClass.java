package innerclass;

public class MyClass{
	public static void main(String args[]) {
	      // Instantiating the outer class 
	      Outer outer = new Outer();
	      
	      // Accessing the display_Inner() method.
	      outer.display_Inner();
	      
	      Outer.Inner inner = outer.new Inner();
	   }
	
}

class Outer{
	
	public class Inner{
		public void print() {
	         System.out.println("This is an inner class");
	      }
			
	}
	
	// Accessing he inner class from the method within
	   void display_Inner() {
	      Inner inner = new Inner();
	      inner.print();
	   }
}
