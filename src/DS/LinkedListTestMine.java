package DS;

public class LinkedListTestMine
{
	public static LinkedList1 linkdeList;
	
	public static void main(String[] args)
	{
		linkdeList = new LinkedList1();
		linkdeList.add("2");
		linkdeList.add("5");
	}
}
class LinkedList1
{
	private static int counter;
	private Node head;
	
	// appends the specified element to the end of this list.
		public void add(Object data) {
			
			//Here we are initialize Node only while adding 1st element.
			// Initialize Node only incase of 1st element
			if (head == null) {
				head = new Node(data);
			}
	 
			Node n1 = new Node(data);
			Node n2 = head;
	 
			// Let's check for NPE before iterate over crunchifyCurrent
			if (n2 != null) {
	 
				// starting at the head node, crawl to the end of the list and then add element after last node
				while (n2.getNext() != null) {
					n2 = n2.getNext();
				}
	 
				// the last node's "next" reference set to our new node
				n2.setNext(n1);
			}
	 
			// increment the number of elements variable
			incrementCounter();
		}
	
	
	private static int getSize() {
		return counter;
	}
 
	private static void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
	
	private class Node
	{
		private Node next;
		private Object data;
		
		public Node(Object value)
		{
			next = null;
			data = value;
		}
		
		public Object getData()
		{
			return data;
		}
		
		public void setNext(Node nextVal)
		{
			next=nextVal;
		}
		
		public Node getNext()
		{
			return next;
		}
	}
}