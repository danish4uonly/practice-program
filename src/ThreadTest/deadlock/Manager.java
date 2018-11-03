package ThreadTest.deadlock;


public class Manager{
	public static void main(String[] args) {
		
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		A a1 = new A(s1, s2);
		a1.start();
		
		B b1 = new B(s1, s2);
		b1.start();
		
		Util.sleep(2000);
		
	}
}

class Shared {
	
	synchronized void test1(Shared  s){
		System.out.println("test1 begin");
		Util.sleep(1000);
		s.test2(this);
		System.out.println("test1 end");
	}
	
	
	synchronized void test2(Shared  s){
		System.out.println("test2 begin");
		Util.sleep(1000);
		s.test1(this);
		System.out.println("test2 end");
	}

}

class A extends Thread{
	Shared s1, s2;
	A(Shared s1, Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run(){
		s1.test1(s2);
	}
}

class B extends Thread{
	Shared s1, s2;
	B(Shared s1, Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run(){
		//s1.test2(s2);
	}
}

class Util{
	static void sleep(long millis){
		try{
			Thread.sleep(millis);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
}
