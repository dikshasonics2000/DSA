package dataStructureAndAlgo;

public class CustomStackUsingLinkList {
            public static void main(String args[])
            {
            	CustomStackUsingLinkList stackList = new CustomStackUsingLinkList();
            	stackList.push(6);
            	stackList.push(8);
            	stackList.push(9);
            	stackList.push(4);
            	stackList.push(7);
				System.out.println(stackList.pop());
				System.out.println(stackList.pop());

	


            }

			private int pop() {
				// TODO Auto-generated method stub
				int dataPopped = -1;
			if(head == null)
			{
				System.out.println("stack underflow");
				
			}
			else
			{
			    dataPopped =head.data;
				head = head.nextNode;
				
			}
			
			return dataPopped;
			}

			private Node head;

			private void push(int dataToBeInserted) {
				// TODO Auto-generated method stub
				if(head == null)
				{

					head = new Node(dataToBeInserted);
					
				}
				else {

					Node newNode = new Node(dataToBeInserted);
					newNode.nextNode =head;
					head = newNode;
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
}
