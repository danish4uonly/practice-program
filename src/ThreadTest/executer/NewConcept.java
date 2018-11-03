package ThreadTest.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewConcept{
	
	public static void main(String[] args) {
		
//==================================================================================================================================
		
// 1st way of creating thread:
		Thread t = new Thread(new A());
		t.start();
		
//===================================================================================================================================
		
// 2nd way of creating thread: using java 8:
		
		//As Runnable is a functional interface which is having only one method run(). so we can write like this:
		Runnable task = () -> {
			//Here is my task which I want to perform.
			System.out.println("task2");
		};
		Thread thread = new Thread(task);
		thread.start();
		
		//Here Thread is created on demand by the user. The user can create 1000 of thread in application which is killing it.
		//This idea is not great idea.
		//thread.start(); --> A thread is created and once the task is done then thread dies. i..e. how its starts method works.
		//problem is that: thread is very expensive to create and dies. this is not great idea.
		
		//The executor comes to resolve this issue.
		
//==================================================================================================================================		
		
// 3rd way of creating thread which is very important and that we are using in industry i.e. industry standard:

		//The executor comes to resolve this issue.  : 1. Create pool of threads 2. pass a task to this pool.
		
		//By creating pools of ready to use threads and using them,.
		// We pass a task to a pool of threads, that will execute it.
		
		//1.
		//Executor is having only one method.
		//pool of thread is an instance of executor interface.
		/*public interface Executor{
			void execute(Runnable task);
		}*/
		
		//2.
		//ExecutorService
		//it has all the implentation of Executor and more methods as well.
		/*public interface ExecutorService extends Executor{
			//11 more methods.
		}*/
		//Executors (s) The factory class --> proposes ~20 methods to create executors.
		
		
		//Lets build a pool with only one thread in it:
		
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		//The thread in this pool will be kept alive as long as this pool is alive.
		/**now when we pass the task in it . this task will be executed in this thread and this thread will not be destroyed 
		once the task is done.
		Now the question brings how we destroy or free the thread . answer is : we can shutdown an ExecutorService.
		*/
		
		//.newSingleThreadExecutor() -> will create pool of thread with only one thread in it.
		//.newFixedThreadPoolExecutor(8); -> pool of thread with 8 thread in it. you can give any no thread.
		
		//3rd way: and best way:
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Runnable task1 = () -> {
			//Here is my task which I want to perform.
			System.out.println("task3");
		};
		
		executor.execute(task1);
		
		//two pattern : 
		/**
		 *   1. Executor Pattern: 
		 *   executor.execute(task);
		 *   
		 *   2. Runnable pattern :
		 *   new Thread(task).start();
		 */
		
		/**ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Runnable task1 = () -> someReallyLongProcess();   --> eg : waiting 
		Runnable task2 = () -> anotherReallyLongProcess();
		
		executor.execute(task1);
		executor.execute(task2);
		
		*Its gurantee that first task will execute and then second. rule. ordering..
		*
		*Question:
		*1. Can we know if a task is done or not?  Ans No
		*2. Can we cancel the execution of a task?  Ans: Yes if the task is not started (remove from waiting queue. If task is started then its not possible to cancel.
		*/
		
		//4th way: Callable
		/**ExecutorService executor = Executors.newSingleThreadExecutor();
		Runnable task1 = () -> {
			//Here is my task which I want to perform.
			System.out.println("task3");
		};
		
		@FunctionalInterface
		public interface Runnable{
			void run();  --> does't not return anything and does not throw any exception.
		}
		
		Here :		
		1. it will return nothing : void run() in Runnable interface. No object is returned.
		2. No exception can be raised.
		3. There is no way to know the task is complete or not.
		
		Like the case we consider. We have a database query which throw sql exception then its not possible in above case.
		therefore go for Callable.
		*/
		/**
		 * 1. How can task return a value?
		 * 2. How can we get the exception raised by the task? SQLException or IOexception
		 * 3. How can this Exception will go from one thread to another?
		 * 
		 * 
		 * Now Executor pattern uses another interface called as Callable interface:
		 * Therefore New Model came: Callable.
		 * 
		 * @FunctionalInterface
			public interface Callable<V>{
				V call() throws Exception;  
			}
		 * 
		 *  But Executer interface does not handle callables --> execute method will accept Runnable interface.  i.e. executor.execute(task1); we cannot use this one for Callable
		 *  
		 *  The ExecuterService interface has submit() method which accepts Callable and returns Future object.
		 *  
		 *  <T> Future<T> submit(Callable<T> task);
		 */
		
		
		/**ExecutorService executorService = Executors.newSingleThreadExecutor();
		Callable<String> taskCall = () -> {
			System.out.println("task3");
			return "test";
		};
		
		Future<String> future = executorService.submit(taskCall);
		
		String result = future.get();
		//get will be blocked until we recives the from other thread.
*/		
	}	
}



class A implements Runnable{

	//This is my task which i want to perform:
	@Override
	public void run() {
		
		System.out.println("task1");
	}	
}
