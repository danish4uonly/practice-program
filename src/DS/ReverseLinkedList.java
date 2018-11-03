package DS;

/**Very Easy
 * 
 * https://www.youtube.com/watch?v=SMIq13-FZSE&t=10s
 * https://www.youtube.com/watch?v=AeqXFjCUcQM
 * https://www.youtube.com/watch?v=tZxPqhkRLiw
 * 
 * reverse :
 * https://www.youtube.com/watch?v=jY-EUKXYT20&t=418s
 * 
 * @author Acer
 *
 */

public class ReverseLinkedList {
	
	Node head;
	
	private int counter;
	
	public static void main(String[] args){
		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.add(12);
		linkedList.add(44);
		linkedList.add(9);
		
		linkedList.addFirst(87);
		
		linkedList.addAt(2, 74);
		
		linkedList.addAt(0, 97);
		
		linkedList.display();
		
		System.out.println();
		System.out.println("value at index location 5 : "+linkedList.get(5));
		
		System.out.println("Size of linked list : "+linkedList.size());
		
		linkedList.deleteAt(2);
		linkedList.display();
		
		System.out.println();
		linkedList.reverse();
		linkedList.display();
		
		
		System.out.println();
		linkedList.reverseLinkedList();
		linkedList.display();
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
		Node node = new Node();
		node.data = data;
		node.next = null;
		
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
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
		counter++;
	}

	public void add(Object data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		
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
		 while(node.next!=null){
			 System.out.print(node.data+" ");
			 node = node.next;
		 }
		 System.out.print(node.data);
	}
	

public class Node{
		private Object data;
		private Node next;
	}
}


