package ThreadTest.InterThread;

public class InterThreadCommunication {
	
	public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();
        //new Thread(waiter,"waiter").start();
        
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }
	//When we will invoke the above program, we will see below output but program will not complete because there are two threads waiting on Message object and notify() method has wake up only one of them, the other thread is still waiting to get notified.
	//If we comment the notify() call and uncomment the notifyAll() call in Notifier class, below will be the output produced.
	//Since notifyAll() method wake up both the Waiter threads and program completes and terminates after execution. That’s all for wait, notify and notifyAll in java.
}
