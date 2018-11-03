package company.johnsoncontrol;

/**One thread can print even number and other can print odd : 1 to 100*/
public class EvenOdd{
	
	public static void main(String[] args){
	    Object lock = new Object(); 
	    Thread thread1 =  new Thread(new PrintOdd(lock));
	    Thread thread2 =  new Thread(new PrintEven(lock));
	    thread1.start();
	    thread2.start();
	
	}
}

class PrintOdd implements Runnable{
	
	private Object lock;
	public PrintOdd(Object lock) {
	    this.lock =  lock;
	}
	
	@Override
	public void run() {
		 synchronized (lock) {
		        for (int i = 1; i <= 100; i+=2) {
		            System.out.println("ODD:="+i);
		            lock.notify();
		            try {
		                //if(i!=9) lock.wait();
		                lock.wait(500);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }
	}
	
}

class PrintEven implements Runnable{
	
	private Object lock;
	public PrintEven(Object lock) {
	    this.lock =  lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
	        for (int i = 2; i <= 100; i+=2) {
	            System.out.println("EVEN:="+i);
	            lock.notify();
	            try {
	                //if(i!=10) lock.wait();
	                lock.wait(500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	
}