package dataStructureAndAlgo;

public class CustomQueueUsingLinkList implements IQueue {
     public static void main(String args[])
     
     {
    	 CustomQueueUsingLinkList queueList = new CustomQueueUsingLinkList();
    	/* queueList.push(8);
    	 queueList.push(9);
    	 queueList.push(4);
    	 queueList.pop();
    	 queueList.pop();*/

     }
     private Node head;
 	Node rear;
 	
	public int pop() {
		// TODO Auto-generated method stub
		if(head != null)
		{
			int temp = head.data;
			System.out.println(head.data);
			head = head.nextNode;
			return temp;
		}
		else
			System.out.println("queue underflow");
		return 0;
	}
		public void push(int dataToBeInserted) {
		
		// TODO Auto-generated method stub
		
		if(head == null)
		{
			head = new Node(dataToBeInserted);
			rear = head;
		}
		else
		{
			Node newNode = new Node(dataToBeInserted);
			rear.nextNode = newNode;
			rear = newNode;
		}
		 traverseList();
	}
	
	
	public void traverseList() {
		// TODO Auto-generated method stub
		System.out.println("Current link list is - ");
		Node headToBeTraveresed = head;
		
		while(headToBeTraveresed != null)
		{
			System.out.print(headToBeTraveresed.data + " ");
			headToBeTraveresed = headToBeTraveresed.nextNode;
		}
		System.out.println("Current link list print complete ");
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(head == null)
		return true;
		return false;
	}
	}
