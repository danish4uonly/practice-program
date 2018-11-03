package DS;

public class MyStack {
	   private int maxSize;
	   private long[] stackArray;
	   private Object[] objectArray;
	   private int top;
	   public MyStack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      objectArray = new Object[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	      //objectArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	      //return objectArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	      //return objectArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
	      MyStack theStack = new MyStack(10); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      //stack LIFO
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
	}
