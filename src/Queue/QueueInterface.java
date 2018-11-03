package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args){
		
		int[] arr = {1,2,4,6,7,8,9,11,33,55,100};
		
			for(int j=1;j<=100;j++){
				for(int i = 0;i<arr.length;i++){
				if(arr[i]!=j){
					System.out.print(j);
				}
			}
		}
		
		
	
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(5);
		q.add(3);
		q.add(8);
		
		for(Integer i : q){
			System.out.print(" Fetch :"+i);
		}
		System.out.println();
		
		boolean b = q.offer(9);
		
		System.out.println(b);
		for(Integer i : q){			
			System.out.print(" Fetch :"+i);
		}
		
		//offer
		//peek -- element
		//poll --- remove
		
		//the first element in queue is known as head and last is known as tail
	/*
	boolean offer(Object obj): 
	Adds the element obj to the queue. If the addition is successful, the method returns true else false. 
		 
	Object peek():
    The peek() method retrieves the value of the head (first) element of the queue without removing it from the queue. 
    For each invocation of the method we always get the same value and its execution
    does not affect the size of the queue. If the queue is empty the peek() method returns null.
    
    Object element():
    The element() method behaves like peek(), so it again retrieves the value of the head (first) element without removing it. 
    Unlike peek ), however, if the list is empty element() throws a NoSuchElementException
    
    Object poll(): 
    The poll() method retrieves the value of the head (first) element of the queue by removing it from the queue. 
    At each invocation it removes the first element of the list and if the list is already empty it returns null but 
    does not throw any exception
    
    Object remove():
    The remove() method behaves as the poll() method, so it removes the head (first) element of the list and if the list is 
    empty it throws a NoSuchElementException

	*/
		System.out.println("\nPEEK");
		Queue<Integer> qi = new LinkedList<>();
		System.out.println(qi.peek());
		//System.out.println(qi.element()); //NoSuchElementException
        qi.add(50);
        qi.add(100);
        qi.add(25);
        
        
        Integer x = qi.peek();
        System.out.println(x);

        x = qi.peek();
        System.out.println(x);

        System.out.println(qi);
        
        
        System.out.println("POLL");
        Queue<Integer> qii = new LinkedList<>();
        qii.add(50);
        qii.add(100);
        qii.add(25);

        Integer xi = qii.poll();
        System.out.println(xi);

        xi = qii.poll();
        System.out.println(xi);

        System.out.println(qii);
        
        xi = qii.poll();
        System.out.println(xi);

        System.out.println(qii);
        
       /* xi = qii.remove();
        System.out.println(xi);*/ //NoSuchElementException
		
	}
}
