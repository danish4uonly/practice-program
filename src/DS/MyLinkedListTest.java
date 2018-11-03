package DS;

public class MyLinkedListTest {
	private static MyLinkedList myLinkedList;
	public static void main(String[] args){
		myLinkedList = new MyLinkedList();
		myLinkedList.add(3);
		myLinkedList.add(5);
		myLinkedList.add(7);
		System.out.println("LinkedList Added as :\n");
		for(int i = 0; i<myLinkedList.size(); i++){
			System.out.print(myLinkedList.get(i)+" ");
		}
	}

}
class MyLinkedList{
	private Node head;
	private int counter;
	
	public void add(Object data){
		if(head==null){
			head=new Node(data);
		}
		Node temp=new Node(data);
		Node current=head;
		if(current!=null){
			while(current.getNext()!=null){
				current=current.getNext();
			}
			current.setNext(temp);
		}
		counter++;
	}
	
	public int size(){
		return counter;
	}
	
	public Object get(int index){
		if (index < 0)
			return null;
		Node current = null;
		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
 
				current = current.getNext();
			}
			return current.getData();
		}
		return current;		
	}
	
	private class Node{
		Node next;
		Object data;
		
		public Node(Object dataValue){
			next=null;
			data=dataValue;
		}
		
		public Object getData(){
			return data;
		}
		
		public Node getNext(){
			return next;
		}
		
		public void setNext(Node nextValue){
			next=nextValue;
		}
	}
}