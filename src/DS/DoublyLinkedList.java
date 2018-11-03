package DS;

public class DoublyLinkedList{
	
	private Node head;
	private Node tail;
	private int length;
	
	public DoublyLinkedList(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.append(2);
		dll.append(1);
		dll.append(9);
		dll.append(5);
		dll.append(4);
		
		dll.forwardTraverse();
		System.out.println();
		dll.reverseTraverse();
	}
	
	//Adding a node at the front of the list
    public void push(int new_data)
    {
        /* 1. allocate node 
        * 2. put in the data */
        Node new_Node = new Node(new_data);
         
        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.previous = null;
         
        /* 4. change prev of head node to new node */
        if(head != null)
            head.previous = new_Node;
 
        /* 5. move the head to point to the new node */
        head = new_Node; 
    }
    
  //Add a node at the end of the list
    void append(int new_data)
    {
        /* 1. allocate node 
        * 2. put in the data */
        Node new_node = new Node(new_data);
         
        Node last = head;/* used in step 5*/
         
        /* 3. This new node is going to be the last node, so
        * make next of it as NULL*/
        new_node.next = null;
         
        /* 4. If the Linked List is empty, then make the new
        * node as head */
        if(head == null)
        {
            new_node.previous = null;
            head = new_node;
            return;
        }
         
        /* 5. Else traverse till the last node */
        while(last.next != null)
            last = last.next;
         
        /* 6. Change the next of last node */
        last.next = new_node;
         
        /* 7. Make last node as previous of new node */
        new_node.previous = last;
    }
	
	public void forwardTraverse(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public void reverseTraverse(){
		
		Node last = null;
       
        while(head != null)
        {
            last = head;
            head = head.next;
        }
        
        while (last != null)
        {
            System.out.print(last.data + " --> ");
            last = last.previous;
        }
        System.out.print("null");
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length == 0; // head == null;
	}
	
	private class Node{
		
		private Node next;
		private Object data;
		private Node previous;
		
		public Node(Object data){
			/*this.next = null;*/
			this.data = data;	
			/*this.previous = null;*/
		}
	}
}