package innerclass;

public class StaticInnerClass {
	
	
	public static void main(String[] args)
    {
		/**StaticInnerClass vv = new StaticInnerClass();
		vv.test();*/
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        
        nestedObject.display();
 
         
    }
	
	
}

//outer class
class OuterClass
{ 
 // static member
 static int outer_x = 10;
  
 // instance(non-static) member
 int outer_y = 20;
  
 // private member
 private static int outer_private = 30;
  
 // static nested class
 static class StaticNestedClass
 {
     void display()
     {
         // can access static member of outer class
         System.out.println("outer_x = " + outer_x);
          
         // can access display private static member of outer class
         System.out.println("outer_private = " + outer_private);
          
         
         // The following statement will give compilation error
         // as static nested class cannot directly access non-static member
         // System.out.println("outer_y = " + outer_y);
         
         /**OuterClass o = new OuterClass();
         System.out.println(o.outer_y);*/
      
     }
 }
}



/**Difference between static and inner(non-static nested) classes

Static nested classes do not directly have access to other members(non-static variables and methods) of the 
enclosing class because as it is static, it must access the non-static members of its enclosing class through an object. 
That is, it cannot refer to non-static members of its enclosing class directly. Because of this restriction, static nested classes 
are seldom used.
Non-static nested classes (inner classes) has access to all members(static and non-static variables and methods, including private) 
of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.*/
