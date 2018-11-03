package innerclass;

public class LocalInnerClass {
	public static void main(String[] args)
    {
		/**To instantiate an inner class, you must first instantiate the outer class. 
		Then, create the inner object within the outer object with this syntax:*/
        // accessing an inner class
		OuterClass1 outerObject = new OuterClass1();
		OuterClass1.InnerClass innerObject = outerObject.new InnerClass();
         
        innerObject.display();
         
    }
}
	
	// a inner class
	 //only default, public, abstract and private
	// outer class
	class OuterClass1
	{
	    // static member
	    static int outer_x = 10;
	     
	    // instance(non-static) member
	    int outer_y = 20;
	     
	    // private member
	    private int outer_private = 30;
	     
	    //As a member of its enclosing class, a nested class can be declared private, public, protected, or package private(default). 
	    //and static as well
	    // inner class
	    class InnerClass
	    {
	        void display()
	        {
	            // can access static member of outer class
	            System.out.println("outer_x = " + outer_x);
	             
	            // can also access non-static member of outer class
	            System.out.println("outer_y = " + outer_y);
	             
	            // can also access private member of outer class
	            System.out.println("outer_private = " + outer_private);
	         
	        }
	    }
}
	
	//https://www.geeksforgeeks.org/anonymous-inner-class-java/
