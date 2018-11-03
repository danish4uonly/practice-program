package New;

public class MainMethodConcept {
	
	//must read :
	//http://javarevisited.blogspot.in/2011/12/main-public-static-java-void-method-why.html
	
	/*public static void main(String args[]){
    	
    	System.out.println("asd");
    	
    }*/
	
	//void -return type should always be before method name.
	//public static final you can interchange with anyone no problem
	//public static void -- this three must present in main method other wise runtime error, jvm will not able to call main method.
	
	public final static void main(String... xyz){
    	
    	System.out.println("asd");
    	
    }
    
    //valid:
    /*public static void main(String[] xyz)
    public static void main(String argument[])
    public static void main(String... args)
    public static synchronized void main(String... args)
    public static strictfp void main(String... args)
    public static final void main(String... args)*/

}

/*
 *  What is the main method in Java?
Main method in Java is entry point for any core Java program. Remember we are not talking about Servlet, 
MIDlet or any other container managed Java program where life cycle methods are provided to control the execution. 
In core Java program, execution starts from main method when you type java main-class-name, 
JVM search for public static void main(String args[]) method in that class and if it doesn't find that method it
 throws error NoSuchMethodError:main and terminates.

*/

