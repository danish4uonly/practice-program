package com;
public class LinkedListTest
{
	public static LinkedList linkedList;
	public static void main(String[] args)
	{
		linkedList = new LinkedList();
	}
	
}

class LinkedList
{
	private static int counter;
	private Node head;
	
	
	
	public void add(Object data)
	{
		if (head==null)
		{
			head=new Node(data);
		}
		Node temp = new Node(data);
		Node current = head;
		if(current!=null)
		{
			while(current.getNext()!=null)
			{
				current=current.getNext();
			}
			//current=current.setNext(temp);
		}
	}
	private class Node
	{
		Node next;
		Object dataValue;
		
		public Node(Object data)
		{
			next=null;
			dataValue=data;
		}
		
		public Object getData() {
			return dataValue;
		}
		
		public void setNext(Node val)
		{
			next=val;
		}
		public Node getNext()
		{
			return next;
		}
	}
}