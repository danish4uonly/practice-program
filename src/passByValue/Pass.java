package passByValue;

public class Pass {

	//Java is Pass by value:
	//if you pass primitive then id did affect original value. so pass by value
	// if you pass object and create new object and it wont reflect original value , it will point to different location , so pass by value.
	// if you don't create new object then it will point to same location then it will affect original value, so pass by value.create 
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swap : "+ a+ " "+b);
		
		test(a, b);
		
		System.out.println("After swap : "+ a+ " "+b);
		
		Catch c = new Catch();
		c.setA(10);
		c.setB(20);
		
		System.out.println("Before :  "+c.getA() + "  "+c.getB());
		
		test1(c);
		
		System.out.println(" After  "+c.getA() + "  "+c.getB());
		
		test2(c);
		
		System.out.println(" After  "+c.getA() + "  "+c.getB());

	}
	
	public static void test(int a, int b){
		
		int t = a;
		a = b;
		b = t;		
	}
	
	/**
	 * Changes are reflected back if we do not assign reference to a new location or object:
If we do not change the reference to refer some other object (or memory location), we can make changes to the members and these changes are reflected back.
	 * @param c
	 */
	public static void test1(Catch c){
		
		int t = c.getA();
		int a = c.getB();
		c.setA(a);
		c.setB(t);			
	}
	
	//The changes are not reflected back if we change the object itself to refer some other location or object
	public static void test2(Catch c){
		// We changed reference to refer some other location
        // now any changes made to reference are not reflected
		c = new Catch();
		
		int t = c.getA();
		int a = c.getB();
		c.setA(a);
		c.setB(t);			
	}
}

class Catch{
	
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}	
}
