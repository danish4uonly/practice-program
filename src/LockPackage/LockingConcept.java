package LockPackage;

public class LockingConcept {
	
	/*A java.util.concurrent.locks.Lock is a thread synchronization mechanism just like synchronized blocks. 
	A Lock is, however, more flexible and more sophisticated than a synchronized block. Since Lock is an interface, 
	you need to use one of its implementations to use a Lock in your applications. ReentrantLock is one such 
	implementation of Lock interface.*/
	
	/*Lock lock = new ReentrantLock();
	 
	lock.lock();
	 
	//critical section
	 
	lock.unlock();*/
	
	/*First a Lock is created. Then it’s lock() method is called. Now the Lock instance is locked. 
	Any other thread calling lock() will be blocked until the thread that locked the lock calls unlock(). 
	Finally unlock() is called, and the Lock is now unlocked so other threads can lock it.*/
	
	//Difference between Lock Interface and synchronized keyword :
	
	/*1. The synchronized block must be fully contained within a single method. -->using notify() and notifyAll()
	A Lock can have it’s calls to lock() and unlock() in separate methods.
	//eg : public class Reentrant2{

	  /*Lock lock = new Lock();

	  public outer(){
	    lock.lock();
	    inner();
	    lock.unlock();
	  }

	  public synchronized inner(){
	    lock.lock();
	    //do something
	    lock.unlock();
	  }
	}
	
	2. Synchronization code is much cleaner and easy to maintain whereas with Lock we are forced to have
	 try-finally block to make sure Lock is released even if some exception is thrown between lock() and unlock() 
	 method calls. 
	 
	 3. synchronized keyword doesn’t provide fairness whereas we can set fairness to true while 
	 creating ReentrantLock object so that longest waiting thread gets the lock first.
	*/
	
	//Reentrant lock is nothing but same working principle as synchronized but here we are using lock() and unlock() 
	//method of lock interface . ReentrantLock is implementing class of Lock interface
	
	public static void main(String[] args)
	   {
	      PrinterQueue printerQueue = new PrinterQueue();
	      Thread thread[] = new Thread[10];
	      for (int i = 0; i < 10; i++)
	      {
	         thread[i] = new Thread(new PrintingJob(printerQueue), "Thread " + i);
	      }
	      for (int i = 0; i < 10; i++)
	      {
	         thread[i].start();
	      }
	   }
}
