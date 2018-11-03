package company.forecubes;

/**
 * 
 * @author Acer
 * 
 * Q1.
 * Remove all occurrences of duplicates from sorted Linked list
 *
 *	Input :  69 -> 69 -> 72 -> 76 -> 82 -> 82 -> 96 -> null
 *	Output : 72 -> 76 -> 96 -> null
 *
 *  Input :  69 -> 69 -> 72 -> null
 *	Output : 72 -> null
 *	
 *	Input :  69 -> 72 -> null
 *	Output : 69 -> 72 -> null
 *
 *	Input : 23->28->28->35->49->49->53->53
	Output : 23->35

	Input : 11->11->11->11->75->75
	Output : empty List
 *
 * Q2.
 * Remove duplicates from sorted Linked list
 *
 *	Input :  69 -> 69 -> 72 -> 76 -> 82 -> 82 -> 96 -> null
 *	Output : 69 -> 72 -> 76 -> 82 -> 96 -> null
 *
 *  Input :  69 -> 69 -> 72 -> null
 *	Output : 69 -> 72 -> null
 *	
 *	Input :  69 -> 72 -> null
 *	Output : 69 -> 72 -> null
 */

public class RemoveDuplicatesFromLinkedList {
	
	Node head;
	
	private int counter;
	
	public static void main(String[] args){
		RemoveDuplicatesFromLinkedList linkedList = new RemoveDuplicatesFromLinkedList();
		linkedList.add(69);
		linkedList.add(69);
		linkedList.add(72);
		linkedList.add(72);
		linkedList.add(76);
		linkedList.add(82);
		linkedList.add(82);
		linkedList.add(96);
		linkedList.add(97);
		
		
		System.out.println("Original LinkedList :");
		linkedList.display();
		System.out.println();
		
		System.out.println("Remove duplicates :");
		linkedList.removeDuplicates();		
		linkedList.display();
		System.out.println();
		
		
		System.out.println("Remove all occurrences of duplicates :");
		linkedList.removeAllDuplicates();		
		linkedList.display();
		System.out.println();	
		
		linkedList.printMiddleBest();
		
	}
	
	//not working.....please see
	public void removeAllDuplicates(){
		/* create a dummy node that acts like a fake
        head of list pointing to the original head*/
      Node dummy = new Node(0);

      /* dummy node points to the original head*/
      dummy.next = head;
      Node prev = dummy;
      Node current = head;

      while (current != null)
      {
          /* Until the current and previous values
             are same, keep updating current */
          while (current.next != null &&
                 prev.next.data == current.next.data)
              current = current.next;

          /* if current has unique value i.e current
              is not updated, Move the prev pointer
              to next node*/
          if (prev.next == current)
              prev = prev.next;

          /* when current is updated to the last
             duplicate value of that segment, make
             prev the next of current*/
          else
              prev.next = current.next;

          current = current.next;
      }

      /* update original head to the next of dummy
         node */
      head = dummy.next;
	}
	
	//Time Complexity: O(n) where n is number of nodes in the given linked list. -> best
	public void removeDuplicates(){
		/*Another reference to head*/
        Node current = head;
 
        /* Pointer to store the next pointer of a node to be deleted*/
        Node next_next;
 
        /* do nothing if the list is empty */
        if (head == null)    
            return;
 
        /* Traverse list till the last node */
        while (current.next != null) {
 
            /*Compare current node with the next node */
            if (current.data == current.next.data) {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
                /*next_next = null;*/ /**either make null or leave as it is */
            }
            else // advance if no deletion
               current = current.next;
        }
	}
	
	public void reverse(){
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current!=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public int size(){
		 return counter;
	}
	
	public void deleteAt(int index){
		
		if(index==0){
			head = head.next;
		}else{
			Node node = head;
			Node temp = null;
			for(int i=0; i<index-1; i++){
				node = node.next;
			}
			temp = node.next;
			node.next = temp.next;
			temp = null;
		}
	}
	
	public Object get(int index){
		
		if (index < 0)
			return null;
		
		if(index>=counter)
			throw new ArrayIndexOutOfBoundsException();
		
		Node node = head;
		for(int i=0; i<index; i++){
			node = node.next;
		}
		
		return node.data;
	}
	
	public void addAt(int index, Object data){
		Node node = new Node(data);
		
		
		Node n = head;
		
		if(index==0){
			addFirst(data);
		}
		else{
			for(int i=0; i<index-1; i++){
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			counter++;
		}
	}
	
	public void addFirst(Object data){
		Node node = new Node(data);
		
		node.next = head;
		head = node;
		counter++;
	}

	public void add(Object data){
		Node node = new Node(data);
		
		
		if(head == null){
			head = node;
		}
		
		else{
			Node n = head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}
		counter++;
	}
	
	/**Method 2:
	Traverse linked list using two pointers. Move one pointer by one and other pointer by two. 
	When the fast pointer reaches end slow pointer will reach middle of the linked list.*/
	/* Function to print middle of linked list */
    void printMiddle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" +
                                slow_ptr.data + "] \n");
        }
    }
    
    /**If there are even nodes, then there would be two middle nodes, we need to print second middle element.*/
    /* Function to print middle of linked list */
    /*Initialize mid element as head and initialize a counter as 0. 
    Traverse the list from head, while traversing increment the counter and change mid to mid->next 
    whenever the counter is odd. So the mid will move only half of the total length of the list.*/
    void printMiddleBest()
    {
    	int count = 0;
        Node mid = head;
     
        while (head != null)
        {
            /* update mid, when 'count' is odd number */
            if (count%2!=0)
                mid = mid.next;
     
            ++count;
            head = head.next;
        }
     
        /* if empty list is provided */
        if (mid != null){
        	System.out.println("The middle element is [%d]\n\n"+ mid.data);
        }
          
    }
	
	public void reverseLinkedList(){
		Node current = head;
		Node next = null;
		Node previous = null;
		while(current!=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
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


