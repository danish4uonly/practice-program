/*

public class LinkedListTest {
 
public static void main(String[] args) {
        
    LinkedList linkedList = new LinkedList();        
       linkedList.addElement( new LinkedList.Node("1"));
        linkedList.addElement( new LinkedList.Node("2"));
        linkedList.addElement( new LinkedList.Node("3"));
        linkedList.addElement( new LinkedList.Node("4"));
        linkedList.addElement( new LinkedList.Node("5"));
        linkedList.addElement( new LinkedList.Node("6"));
        linkedList.addElement( new LinkedList.Node("7"));
        linkedList.addElement( new LinkedList.Node("8"));
        linkedList.addElement( new LinkedList.Node("9"));
        System.out.println(linkedList);
        printNthElement(linkedList,8);
        
    }
 
    private static void printNthElement(LinkedList linkedList,int n) {
        
        
    LinkedList.Node node = linkedList.getHeaderElement();
    int length=0;
    
    while(node.next()!=null){
        
       if(length==n)
     System.out.println("Element at " + n +"th position is " + node.value());        
    
         length++;
      node=node.next();
    }
    
    if(node.next()==null && length==n)
        System.out.println("Element at " + n +"th position is " + node.value());    
  }
}
class LinkedList{
    private Node headerElement;
    private Node tailorElement;
  
    public LinkedList(){
        this.headerElement = new Node("HeaderElement");
        tailorElement = headerElement;
    }
  
    public Node getHeaderElement(){
        return headerElement;
    }
  
    public void addElement(Node node){
        tailorElement.next = node;
        tailorElement = node;
    }
    
    public String toString() {
		String output = "";
 
		if (headerElement != null) {
			Node crunchifyCurrent = headerElement.next();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.value.toString() + "]";
				crunchifyCurrent = crunchifyCurrent.next();
			}
 
		}
		return output;
	}
  
  
    public static class Node{
        private Node next;
        private String value;
 
        public Node(String value){
            this.value = value;
        }
      
        public String value() {
            return value;
        }
 
        public Node next() {
            return next;
        }
      
        public String toString(){
            return this.value;
        }
    }
}*/