package hello;


public class CustomLinkList {
	/*
	 * 
	 * 1. Insertion at beginning
	 * 2. Insertion at end
	 * 3. Insertion at any place
	 * 4. Deletion - First
	 * 5. Deletion - Last
	 * 6. Deletion - In between
	 * 7. Finding Mid
	 * 8. Palindrome
	 * 9. Circular
	 * 9.1 Reverse
	 * 10. Sum of two link list
	 * 11. Vowel 
	 * 12 Intersection
	 * 13. Deletion of nth node from end
	 * 14.implement stack
	 * 15. implement queue
	 * 16.implement stack using queue
	 * 17.matrix spiral print
	 * 18. find non repeated elements
	 */

	public static void main(String args[])
	{
		//int arrayToBeSearched[] = {2 ,8,2,8,1};
		//new CustomOperations(arrayToBeSearched).searchSingleElement(); 
	
		/*int queue1[] ={2,8,6,9,8 };
		int queue2[] = new int[5];*/
		
		 
		

		//new CustomOperations(stack,queue1,queue2).implementStackUsingQueue(); 

		CustomLinkList linkList = new CustomLinkList();
		//CustomLinkList linkedList = new CustomLinkList();
		CustomLinkList linkList1 = new CustomLinkList();
		CustomLinkList linkList2 = new CustomLinkList();

		/*linkList.InsertAtPosition(2, 1); //output -
		linkList.InsertAtBeginning(3);
		linkList.InsertAtBeginning(4);
		linkList.InsertAtBeginning(5);
		linkList.InsertAtBeginning(6);
		linkList.InsertAtBeginning(9);
		linkList.traverseList();
*/
	 //  new CustomRecursions(linkList).reverseLinkList(linkList.head, null , null); //For null head
		//new CustomRecursions(linkList).traverseLinkList(linkList.head ); //For null head
		//new CustomRecursions(linkList).insertAtEnd(linkList.head,6 ); //For null head
		//int sum = new CustomRecursions(linkList).addNode(linkList.head ); //For null head
        //  System.out.println(sum);
		
		
		//linkList.head.nextNode = new Node(5);

		//linkedList.InsertAtBeginning('a');
		//new CustomOperations(linkedList).shiftVowelsToRight(); //For many head
		//new CustomOperations(linkedList).palindrome(); //For many head

		//linkList.traverseList();
		/*linkList1.InsertAtPosition(2, 1); //output -

		linkList1.InsertAtBeginning(4);
		linkList1.InsertAtBeginning(3);
		linkList1.InsertAtBeginning(6);
		linkList1.InsertAtBeginning(8);*/
		
	}
		//linkList1.traverseList();
		//new CustomOperations(linkList,linkList1,linkList2).sumTwoLinkList(); 
		
		// new CustomOperations(linkList,linkList1).intersection(); //For many head

	/*	linkedList.InsertAtBeginning('h');
		linkedList.InsertAtBeginning('s');
		linkedList.InsertAtBeginning('k');
		linkedList.InsertAtBeginning('i');
		linkedList.InsertAtBeginning('d');
		linkedList.traverseList();*/
		//new CustomOperations(linkedList).shiftVowelsToRight(); //For many head
		//new CustomOperations(linkedList).palindrome(); //For many head

		//linkedList.traverseList();*/

		//new CustomOperations(linkList).getMid(); //For null head
		
		//new CustomOperations(linkList).reversedLinkList(); //For null head
		//new CustomOperations(linkList).makeLastNodeHead(); //For null head

		//linkList.InsertAtPosition(7, 1);
		//new CustomOperations(linkList).makeLastNodeHead(); //For one head
		//new CustomOperations(linkList).deleteAnyNodeFromEnd(2); //For one head

		//new CustomOperations(linkList).reversedLinkList(); //For one head
		//linkList.traverseList();

	   // new CustomOperations(linkList).getMid(); //For one node

		//linkList.InsertAtPosition(2, 1); //output -
		//new CustomOperations(linkList).deleteAnyNodeFromEnd(2); //For one head

	  //  new CustomOperations(linkList).getMid(); //For two node
		//new CustomOperations(linkList).makeLastNodeHead(); //For two head
		//linkList.traverseList();

		//linkList.InsertAtBeginning(1);
		//linkList.InsertAtEnd(5);
		//linkList.InsertAtPosition(6, 3);
		//linkList.traverseList();
		//new CustomOperations(linkList).deleteAnyNodeFromEnd(2); //For one head
		//linkList.traverseList();
		//new CustomOperations(linkList).getMid(); //For odd nodes

		//linkList.InsertAtPosition(444, 6);
		//new CustomOperations(linkList).deleteLastNodeFromEnd(); //For many head

		//new CustomOperations(linkList).makeLastNodeHead(); //For many head
         
		
		//linkList.traverseList();
		//new CustomOperations(linkList).searchCircularNode(); 
		/*new CustomOperations(linkList).getMid(); // for even nodes
		linkList.deleteAtBegining();
        linkList.deleteAtEnd();
        linkList.deleteAtPosition(2);
        linkList.deleteAtPosition(10);
        linkList.deleteAtPosition(3);
        
		linkList.traverseList();
        new CustomOperations(linkList).getMid();
        new CustomOperations(linkList).reversedLinkList();//for many nodes
		linkList.traverseList();*/
		
	
	/*public void traverseList() {
		// TODO Auto-generated method stub
		System.out.println("Current link list is - ");
		Node headToBeTraveresed =head;
		//Node circular = head.nextNode.nextNode;
		while(headToBeTraveresed != null)
		{
			System.out.print(headToBeTraveresed.data + " ");
			headToBeTraveresed = headToBeTraveresed.nextNode;
			/*if(headToBeTraveresed.nextNode == null)
			{
				headToBeTraveresed.nextNode = circular;
				break;
			}
		}
		
		System.out.println("Current link list print complete ");
		
	}
*/
	/*private void InsertAtBeginning(char dataToBeInserted) {
		// TODO Auto-generated method stub
		
		/* Test cases
		 * 1. Head is null
		 * 2. Single node link list
		 * 3. Many node link list
		 
		
		if(this.head == null)
		{
			Node newNode = new Node(dataToBeInserted);
			newNode.nextNode = head;
			head = newNode;
		
		}
		else {
		Node newNode = new Node(dataToBeInserted);
		newNode.nextNode = head;
		head = newNode;
	}
	}

	/*private void deleteAtPosition(int position) {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null
		 * 2.one node delete at 1st position
		 * 3.one node delete at custom position
		 * 4.many node delete at first position
		 * 5. many nodes delete at custom position
		 * 6. delete at the end
		 
		if(head!=null)
		{
			if(head.nextNode == null&& position == 1)
			{
				head = head.nextNode;
			}
			else {
				int counter = 1;
				Node headToBeTraverse = this.head;
				Node tempNode = headToBeTraverse;
				while(headToBeTraverse != null){
					if(counter == position) {
						tempNode.nextNode = headToBeTraverse.nextNode;
						break;
					}
						tempNode = headToBeTraverse;
						headToBeTraverse = headToBeTraverse.nextNode;
						counter++;
					}
				
					
			}
		}
	}


	private void deleteAtEnd() {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null
		 * 2. one node
		 * 3.many node
		 
		if(head!=null)
		{
			Node headToBeTraversed = this.head;

			Node tempNode = headToBeTraversed;
			while(headToBeTraversed.nextNode!=null)
			{
				tempNode = headToBeTraversed;
				headToBeTraversed = headToBeTraversed.nextNode;
			}
			tempNode.nextNode = null;
		}
	}


	private void deleteAtBegining() {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null
		 * 2.one node 
		 * 3.many nodes
		 
		if(this.head!=null)
		{
			head=head.nextNode;
			
		}
		else {
			System.out.println("list is empty");
		}
	}*/


	private void InsertAtPosition(int dataToBeInserted, int position) {
		// TODO Auto-generated method stub
		/*
		 * 1. Head is null
		 * 2. One node and Insert at first position
		 * 3. One node and insert at custom position
		 * 3.1 One node and insert at end
		 * 4. Many node and insert at first
		 * 5. Many node and insert at custom
		 * 6. Position not found
		 */
		  
		 
		if(this.head != null)
		{
			int counter = 1;
			if(head.nextNode == null && position == 1)
			{
				this.InsertAtBeginning(dataToBeInserted);
			}
			else {
			Node nodeToBeTraversed = head;
			Node tempNode = nodeToBeTraversed;	
			while(nodeToBeTraversed != null)
			{
				if(counter == position)
				{
					Node newNode = new Node(dataToBeInserted);
					newNode.nextNode = nodeToBeTraversed;
					tempNode.nextNode = newNode;
					break;
				}
				
				tempNode = nodeToBeTraversed;
				nodeToBeTraversed = nodeToBeTraversed.nextNode;
				counter++;
				
				if(nodeToBeTraversed == null && counter == position)
				{
					tempNode.nextNode = new Node(dataToBeInserted);
					break;
				}
			}
			}
		}
		else
		{
			head = new Node(dataToBeInserted);
		}
	}	
	
	public Node head;
	public Node head1;
	
	public void traverseList() {
		// TODO Auto-generated method stub
		System.out.println("Current link list is - ");
		Node headToBeTraveresed = head;
		//Node circular = head.nextNode.nextNode;
		while(headToBeTraveresed != null)
		{
			System.out.print(headToBeTraveresed.data + " ");
			headToBeTraveresed = headToBeTraveresed.nextNode;
			/*if(headToBeTraveresed.nextNode == null)
			{
				headToBeTraveresed.nextNode = circular;
				break;
			}
		}*/
		
		System.out.println("Current link list print complete ");
		}
	}
	private void InsertAtBeginning(int dataToBeInserted) {
		// TODO Auto-generated method stub
		/*
		 * Test cases
		 * 1. Head is null
		 * 2. Single node link list
		 * 3. Many node link list
		 */
		
		if(this.head == null)
		{
			System.out.println("List is empty");
			return;
		}
		
		Node newNode = new Node(dataToBeInserted);
		newNode.nextNode = head;
		head = newNode;
	}
		
	private void InsertAtEnd(int dataToBeInserted) {
		
		if( this.head != null )
		{
			Node headToBeTraversed = this.head;
			
			while(headToBeTraversed.nextNode != null)
			{
				headToBeTraversed = headToBeTraversed.nextNode;
			}
			
			headToBeTraversed.nextNode = new Node(dataToBeInserted);
			
		}
	}
	

}
