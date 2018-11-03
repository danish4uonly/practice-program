package company.johnsoncontrol;

//https://www.youtube.com/watch?v=oZuR2-AKkXE

//1. string reverse // best complexity program
//2. check palindrome // best complexity program

//Best complexity program
//This method takes O(n) time and O(1) extra space.


/*METHOD 2 (By reversing the list)
This method takes O(n) time and O(1) extra space.
1) Get the middle of the linked list.
2) Reverse the second half of the linked list.
3) Check if the first half and second half are identical.*/
public class PalindromeLinkedList {
	
	Node head;
	
	public static void main(String[] args) {
		
		PalindromeLinkedList linkedList = new PalindromeLinkedList();
		
		linkedList.add('m');
		linkedList.add('a');
		//linkedList.add('d');
		linkedList.add('d');
		linkedList.add('a');
		linkedList.add('m');
		//linkedList.add('m');
		
		System.out.println("Original LinkedList :");
		linkedList.display();
		System.out.println();
		
		linkedList.checkPalindrome();
	}
	
	public void checkPalindrome(){
		Node p = head;
		Node q = head;
		
		Node firstStart;
		Node secondStart;
		
		if(p.next == null){
			System.out.println("It is a palindrome");
			return;
		}
		
		while(true){
			p = p.next.next;
			
			//This is valid for even length
			if(p==null){
				secondStart = q.next;
				break;
			}
			
			//This is valid for odd length
			//if odd then no need of middle element for comparison
			if(p.next == null)
			{
				secondStart = q.next.next;
				break;
			}		
			q = q.next; 
		}
		q.next = null;
		
		secondStart = reverseLinkedList(secondStart); 
		
		firstStart = head;
		
		while(firstStart!=null && secondStart!=null) //compare the two strings
		{		
			if(firstStart.data == secondStart.data)
			{
				firstStart = firstStart.next;
				secondStart = secondStart.next;
			}
			else
			{
				System.out.println("\n Not a Palindrome");
				return;					
			}		
		}	
		System.out.println("It is a Palindrome");
	}
	
	public void add(Object data){
		
		Node node = new Node(data);
	
		if(head == null)
			head = node;
		
		else{
			Node n = head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public Node reverseLinkedList(Node secondStart){
		Node current = secondStart;
		Node next = null;
		Node previous = null;
		while(current!=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public void display(){
		Node node = head;
		
		if(head==null){
			System.out.print("List is empty!");
			return;
		}
		
		 while(node.next!=null){
			 System.out.print(node.data+" -> ");
			 node = node.next;
		 }
		 System.out.print(node.data+" -> null");
	}
	

public class Node{
		private Object data;
		private Node next;
		
		public Node(Object data){
			this.data = data;
		}
	}

}

