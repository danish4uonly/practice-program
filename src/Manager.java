   public class Manager implements Runnable{  
    
     
     public static void main(String args[]){  
    
    	 ThreadGroup tg1 = new ThreadGroup("Group A");   
    	 Thread t1 = new Thread(tg1,new Manager(),"one");     
    	 Thread t2 = new Thread(tg1,new Manager(),"two");     
    	 Thread t3 = new Thread(tg1,new Manager(),"three");  
    	 t1.start();
    	 Thread.currentThread().getThreadGroup().resume();
    	 t2.start();
    	 t3.start();
    	 System.out.println(tg1.getName());
    	 System.out.println(tg1.getParent().getClass());
     
     }

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()); 
		
		
		
		}  
    }  