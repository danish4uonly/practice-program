package singleton;

class MyThread extends Thread{
	
	public void run(){
		
		for(int i=1;i<=5;i++){
			
			System.out.print(i+" - : "+currentThread().getName()+" -> ");
			AccountCreation.getInstance();
		}
	}
}

public class Singleton {
		public static void main(String args[]){
			
			MyThread t1=new MyThread();
			MyThread t2=new MyThread();
			MyThread t3=new MyThread();
			MyThread t4=new MyThread();
			MyThread t5=new MyThread();
			Thread t=new Thread();
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			
		}
		
		
		
		/**
	     * So Singleton can be break by thread way :
	     * 1. Reflection    --> to avoid use enum for object cration as enum dont have constructor , user cannot call constructor of enum, jvm is responsible internally to call constructor of enum.
	     * 2. Serialization  --> To overcome this issue, we have to implement method readResolve() method.
	     * // implement readResolve method
		    protected Object readResolve()
		    {
		        return instance;
		    }
	     * 3. Clone  --> implements clonable interface and override clone method and inside that :throw new CloneNotSupportedException();
	     * @Override
		  protected Object clone() throws CloneNotSupportedException 
		  {
		    throw new CloneNotSupportedException();
		  }
	     */
}
