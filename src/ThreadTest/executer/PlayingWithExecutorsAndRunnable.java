package ThreadTest.executer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PlayingWithExecutorsAndRunnable {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		//1.
		/**Runnable task = () -> System.out.println("I am in thread "+ Thread.currentThread().getName());
		
		for(int i = 0 ; i < 10 ; i++){
			new Thread(task).start();
		}*/
		
		/**I am in Thread Thread-0
		I am in Thread Thread-2
		I am in Thread Thread-1
		I am in Thread Thread-3
		I am in Thread Thread-6
		I am in Thread Thread-8
		I am in Thread Thread-4
		I am in Thread Thread-7
		I am in Thread Thread-9
		I am in Thread Thread-5*/
		
		//2.
		/**Runnable task = () -> System.out.println("I am in thread "+ Thread.currentThread().getName());

		ExecutorService service = Executors.newSingleThreadExecutor();
				
		for(int i = 0 ; i < 10 ; i++){
			service.execute(task);
		}*/
		//Thread 1 since newSingleThreadExecutor in pool 1.
		/**I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1*/
		//After running above program you will see red button is still alive you need to shutdown.
		//service.shutdown();
		
		//3.
		/**Runnable task = () -> System.out.println("I am in thread "+ Thread.currentThread().getName());

		ExecutorService service = Executors.newFixedThreadPool(4);
			
		for(int i = 0 ; i < 10 ; i++){
			service.execute(task);
		}
		service.shutdown()
		*/
		
		/**I am in thread pool-1-thread-1
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-2
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-2
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-2
		I am in thread pool-1-thread-1
		I am in thread pool-1-thread-3
		I am in thread pool-1-thread-4*/
		
		//See in callable we able to take return value from callable in Future using get() method.
		/**Callable<String> task = () -> {
			Thread.sleep(300);
			return "I am in thread "+ Thread.currentThread().getName();
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		for(int i = 0 ; i < 10 ; i++){
			Future<String> future = executor.submit(task);
			System.out.println("I get: "+future.get());
		}
		executor.shutdown();*/
		
		//If you run this code you will get concurrent.TimeoutException and red sign is still on because shutdown method is not executed.
		/**Callable<String> task = () -> {
			Thread.sleep(300);
			return "I am in thread "+ Thread.currentThread().getName();
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		for(int i = 0 ; i < 10 ; i++){
			Future<String> future = executor.submit(task);
			System.out.println("I get: "+future.get(100, TimeUnit.MILLISECONDS));
		}
		executor.shutdown();*/
		
		//Now make shutdown in finally block. its make shutdown even get method throws an exception.
		//handle timeout
		/**Callable<String> task = () -> {
			Thread.sleep(300);
			return "I am in thread "+ Thread.currentThread().getName();
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		try{
			for(int i = 0 ; i < 10 ; i++){
				Future<String> future = executor.submit(task);
				System.out.println("I get: "+future.get(100, TimeUnit.MILLISECONDS));
			}
		}finally{
			executor.shutdown();
		}*/
		
		//Now let us see task does not complete and throws the exception
		//handle application exception through futures.
		/**Callable<String> task = () -> {
			throw new IllegalStateException("I throw an exception in thread "+Thread.currentThread().getName());
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		try{
			for(int i = 0 ; i < 10 ; i++){
				Future<String> future = executor.submit(task);
				System.out.println("I get: "+future.get());
			}
		}finally{
			executor.shutdown();
		}*/
		
		//The JDK comes with several ExecutorService implementation
		//1. newSingleThreadExecutor() --> an executor with only one thread.
		//2. newFixedThreadPool(poolSize) --> an executor with pool size thread.
		//-- in newFixedThreadPool(4) -> 4 thread created at once.
		//3. newCachedThreadPool() --> i)creates thread on demand ii)keeps unused threads for 60 secs iii) then terminates them.
		//newCachedThreadPool() -> thread creates on demand and keep them on certain amount of time. 
		//if thread is unused for 6o sec then this threadpool will destroy them.
		//4. newScheduledThreadPool(poolSize) --> creates a pool of thread. and returns the ScheduledExecutorService.
		// it will do three:
		//i) schedule the task in the future --> schedule(task, delay);
		//ii) scheduleAtFixedRate(task, delay, period) 
		//iii)scheduleWithFixedDelay(task, initialDelay, delay)
		
		
		//three method to shutdown ExecutorService:
		/**1. shutdown(): 
		- continue to execute all submitted task
		- execute waiting tasks
		- do not accept new tasks
		- then shutdown.
		This is the soft way for shutting down an ExecutorService
		
		2. shutdownNow(): if you want to shutdown the ExecutorService quickly and you dont want to wait for other task to complete.then use this.
		- halt the running tasks
		- do not execute waiting tasks
		- then shutdown.
		This is the hard way for shutting down an ExecutorService
			
		3. awaitTermination(timeout):
		- shutdown()   --> so first it will prevent the submission of any new tasks.
		- wait for the timeout --> now it will give the chance to all executing task to complete and to all the waiting task to be executed during this timeout. if after timeout still there is remaining task it will halt everything and clean up the waiting queue. 
		- if there are remaining tasks, then halt everything.*/
		
		
		
	}

}
