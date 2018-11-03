package ThreadTest.InterThread;

//whenever wait method is called , it releases the object lock and it going to waiting stage(something like infinite waiting stage)
//again second thread also going to waiting stage
public class InterThreadComm {
	public static void main(String[] args){
		A a1=new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		
		t1.start();
		t2.start();
		
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("about to release");
		
		//remove and see easy you can understand.
		//A a2 = new A();
		//a2.test2();
		a1.test2();
	}
}

class A{
	
	synchronized void test1(){
		System.out.println("test1 begin");
		try{
			wait();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("test1 end");
	}
	
	synchronized void test2(){
		
		notifyAll();
	}
}

class Thread1 extends Thread{
	A a1;
	Thread1(A a1){
		this.a1=a1;
	}
	public void run(){
		a1.test1();
	}
}

class Thread2 extends Thread{
	A a1;
	Thread2(A a1){
		this.a1=a1;
	}
	public void run(){
		a1.test1();
	}
}
