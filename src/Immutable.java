public final class Immutable{
	public static void main(String[] args) {
        testmethod();
    }

    private static void testmethod() {
    String a="a";
    System.out.println("a 1-->"+a);
    System.out.println("a 1 address-->"+a.hashCode());

    a = "ty";
    System.out.println("a 2-->"+a);

       System.out.println("a 2 address-->"+a.hashCode());
       
       String b="as";
       System.out.println(b.hashCode());
       System.out.println(b.hashCode());
       System.out.println(b.hashCode());
       b="asa";
       System.out.println(b.hashCode());
       
       /*
        * This indicates that whenever you are modifying 
        * the content of immutable string object 'a' a new object 
        * will be created. i.e you are not allowed to change the 
        * content of immutable object. that's why the address are 
        * different for both the object.
        */
       
       String str = "Hello";
       System.out.println("Before String Concat: "+str);
       str.concat("World");
       System.out.println("After String Concat: "+str);
       StringBuffer sb = new StringBuffer("Hello");
       System.out.println("Before StringBuffer Append: "+sb);
       sb.append("World");
       System.out.println("After StringBuffer Append: "+sb);
       
       /*
        * 	
		I can see what he tries to do here, Showing the 
		String 'str' is not changing (or should i said Adding) to HelloWorld. 
		but when you using the StringBuffer it does change. anyway, it's just show that Strings are Immutables. 
        */
       
       StringBuffer sb1 = new StringBuffer("ABC");
       System.out.println(sb1.hashCode());
      /* StringBuffer sb1 = new StringBuffer("ABCDDD");
       System.out.println(sb1.hashCode());*/
       
    }
}