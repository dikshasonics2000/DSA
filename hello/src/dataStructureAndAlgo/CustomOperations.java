package hello;

public class CustomOperations{
	private CustomLinkList linkList;
	private CustomLinkList linkedList;
	private CustomLinkList linkList1;
	private CustomLinkList linkList2;
	private int[] stack;
	private int[] queue1;
	private int[] queue2;

	//private int[] arrayToBeSearched;
	public CustomOperations(int[] stack,int[] queue1,int[] queue2) {
		this.stack = stack;
		this.queue1 =queue1;
		this.queue2 = queue2;	
	}

	
	public CustomOperations(CustomLinkList linkList,CustomLinkList linkList1) {
		this.linkList = linkList;
		//this.linkedList = linkedList;
		this.linkList1 = linkList1;
		this.linkList2 = linkList2;

		// TODO Auto-generated constructor stub
	}


	/*public void sumTwoLinkList() {                                   
		// TODO Auto-generated method stub
		/* * 1. head is null* 2.first list larger than other * 3.second list larger than the other* 4.both nodes is same
	if(linkList.head != null && linkList1.head != null)
		{
			Node pointerUp = linkList.head;
			Node pointerDown = linkList1.head;
			 int upLength = 1;
			 int downLength = 1;
			while(pointerUp.nextNode != null || pointerDown.nextNode != null)                          //get total length of lists
			{
				if(pointerUp.nextNode != null)
				{
					pointerUp = pointerUp.nextNode;
					upLength++;
				}
				if(pointerDown.nextNode != null)
				{
					pointerDown = pointerDown.nextNode;
					downLength++;
			    }
		   }
			int difference = downLength - upLength;
			int startPoint = 1;
			int endPoint = downLength;
			Node nodeToBeTraversed = linkList1.head;
			Node nodeToBeTraversed1 = linkList.head;
			if(upLength > downLength)                                       //search the larger list
			{
				difference = upLength - downLength;
				endPoint = upLength;
				nodeToBeTraversed = linkList.head;
				nodeToBeTraversed1 = linkList1.head;
			}
			int sum = 0;
			Node tempNode =null;
			while(startPoint <= endPoint)                                      // sum the list and reverse it
			{
				if(startPoint <= difference)
				{
					Node newNode = new Node(nodeToBeTraversed.data);
					newNode.nextNode = tempNode;
					linkList2.head = newNode;
				}
				else
				{
					sum = nodeToBeTraversed.data + nodeToBeTraversed1.data;
					Node newNode = new Node(sum);
					newNode.nextNode = tempNode;
					linkList2.head = newNode;
					nodeToBeTraversed1 =nodeToBeTraversed1.nextNode;
				}
				tempNode =  linkList2.head;
				nodeToBeTraversed =nodeToBeTraversed.nextNode;
				startPoint++;
			}
			tempNode = null;
			Node previousNode = null;
			startPoint = 1;
			while(startPoint <= endPoint)
			{
				if(linkList2.head.data > 9)                                        // if data is greater than 9 split it and reverse it      
				{
					if(linkList2.head.nextNode == null)
					{
						Node newNode = new Node(1);
						linkList2.head.data -= 10;
						newNode.nextNode = linkList2.head;
						linkList2.head.nextNode = newNode;
					}
					else {
					linkList2.head.nextNode.data += 1;
					linkList2.head.data -= 10;
					}
 				}
			    	previousNode = linkList2.head.nextNode;
					linkList2.head.nextNode = tempNode;
					tempNode = linkList2.head;
					linkList2.head = previousNode;
					startPoint++;
			}
			if(previousNode == null)
		       linkList2.head = tempNode;
			linkList2.traverseList();	
		}
	 }
	}*/
		
	
	/*public void intersection() {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null
		 * 2.node 1 larger and node 2 smaller
		 * 3.node 1 smaller and node 2 greater
		 * 4.both nodes of the same length
		 * 5.no intersection
		 * 6.one node
		 * 7. both has 2 nodes
		 * 8. first node intersecting
		 
		if(linkList.head != null && linkList1.head != null)
		{
			Node traverseList = linkList.head;
			Node traverseList1 = linkList1.head;
			if(traverseList.nextNode == null && traverseList1.nextNode == null)
			{
				if(traverseList == traverseList1)
					System.out.println("the intersection node is "+ linkList.head.data);
				else 
					System.out.println("no intersection");
			}
			else
			{
				while(true)
				{
					if(traverseList == traverseList1)
					{
						System.out.println("the intersection node is "+ traverseList.data);
						break;
					}
					if(traverseList == linkList1.head && traverseList1 == linkList.head)
					{
						System.out.println("no intersection");
						break;
					}
					if(traverseList.nextNode == null)
						traverseList.nextNode = linkList1.head;
					if(traverseList1.nextNode == null)
						traverseList1.nextNode= linkList.head;
					
					traverseList = traverseList.nextNode;
					traverseList1 = traverseList1.nextNode;

				}
			}
			}
	}*/
	

	public void implementStackUsingQueue() {
		// TODO Auto-generated method stub
		/*
		 * 1.stack is null
		 * 2.stack has only one element
		 * 3.many element
		 */
		
		if( stack.length != 0 )
		{
		   int top = 4;	
		  int front = 0;
		  int rear = stack.length;
		  int queue2front =-1;
		  int queue2rear =-1; 
          int temp = 0;
         if(front == rear-1)
         {
   		  System.out.println(" deleted element is"+ queue1[front]); 
          }
         else {
		  while(front <rear-1)
		  {
			  queue2[front] = queue1[front];
			  queue2front = 0;
			  queue2rear++;  
			  
			  front++;
		  }
		  temp = queue1[front];
		  rear = rear - 1;
		  System.out.println(" deleted element is"+ temp); 
		}
	}
	}
}



	/*public void searchCircularNode() {
		// TODO Auto-generated method stub
		/* 1.head is null * 2.one node * 3. many nodes with circular loop  * 4.many nodes without intersection
		 
		if(linkList.head != null)
		{
			Node slowPointer = linkList.head;
			Node fastPointer = linkList.head.nextNode;
			int counter = 0;
			while(fastPointer.nextNode != null)
			{
				if(counter == 0){
				slowPointer = slowPointer.nextNode;
				fastPointer = fastPointer.nextNode.nextNode;
				}
				if(slowPointer == fastPointer)
					counter++;
				if(counter == 1)
				{
				  if(slowPointer == fastPointer)
				       slowPointer = linkList.head;
				   else
				       slowPointer = slowPointer.nextNode;
				fastPointer = fastPointer.nextNode;
				}
				if(counter == 2){
					System.out.println(slowPointer.data +" is the circular node");
					break;
				}
			}
			if(fastPointer.nextNode == null)
				System.out.println("no circular node present");
		}
	}
}*/



	/*public void shiftVowelsToRight() {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null 
		 * 2.one node * 3.mix consonants and vowels * 4.all vowels * 5.all consonants
		 
		if(linkedList.head != null)
		{
			if(linkedList.head.nextNode == null)
			{
				System.out.println("already sorted");
			}
			else
			{
				Node nodeToBeTraversed = linkedList.head;
				Node tempNode = null;
				Node previousNode = null;
				while(nodeToBeTraversed != null)
				{
					tempNode = nodeToBeTraversed;
					nodeToBeTraversed = nodeToBeTraversed.nextNode;
					if(tempNode.data == 'a'||tempNode.data == 'e'||tempNode.data == 'i'||tempNode.data == 'o'||tempNode.data == 'u'||tempNode == linkedList.head)
					{
						previousNode = tempNode;
					}
					else {
						
						previousNode.nextNode = tempNode.nextNode;
						tempNode.nextNode = linkedList.head;
						linkedList.head = tempNode;
					}
					
				}
			}
		}
	}*/


/*	public CustomOperations(int[] arrayToBeSearched) {
		// TODO Auto-generated constructor stub
		this.arrayToBeSearched = arrayToBeSearched;
	}*/


	/*public void palindrome() {
		// TODO Auto-generated method stub
		/* 1.head is null * 2.one node * 3.many nodes
		if(linkedList.head != null)
		{
		 if(linkedList.head.nextNode == null)
		 {
			 System.out.println("insufficient nodes");
		 }
		 else {
			 int mid = 1;
			 Node fastPointer = linkedList.head.nextNode;
	           Node slowPointer = linkedList.head;
	           while(fastPointer.nextNode !=null)
	           {
			 	   slowPointer = slowPointer.nextNode;
	        	   mid++;
	        	   fastPointer = fastPointer.nextNode;
	        	   if(fastPointer.nextNode != null) {
	        		   fastPointer = fastPointer.nextNode;
	        	   }
	           }
	           Node  nodeToBeTraversed = slowPointer.nextNode;
			   Node  tempNode = slowPointer;
			   Node  nextNode = nodeToBeTraversed.nextNode;
			  while(nodeToBeTraversed != null)
				   {
					   nodeToBeTraversed.nextNode =tempNode;
					   tempNode = nodeToBeTraversed;
					   if(nextNode == null)
						   break;
					  nodeToBeTraversed = nextNode;
					  nextNode = nextNode.nextNode;
				   }
			 int counter = 1;
			 slowPointer.nextNode = null;
			 Node  temp = linkedList.head;
			 while(counter <= mid)
					{
						temp = linkedList.head;
						linkedList.head = linkedList.head.nextNode;
						tempNode = nodeToBeTraversed;
						nodeToBeTraversed = nodeToBeTraversed.nextNode;
						if(temp.data != tempNode.data)
						{
							System.out.println("not a palindrome");
							break;
						}
						counter++;	
					}
					if(counter == mid+1)
						System.out.println("it is a palindrome");
		     }
		}
	}
}*/


	/*public void searchSingleElement() {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null
		 * 2.one or two nodes
		 * 3. many nodes
		 * 4.search not found
		 
		if(arrayToBeSearched.length == 0)
		{
			System.out.println("insert elements");
		}
		else {
			int singleElement = arrayToBeSearched[0];
			
				if(arrayToBeSearched.length % 2 == 0)
				{
					System.out.println("the single element not found");
					
				}
				else {
				for(int counter = 1; counter < arrayToBeSearched.length; counter++)
				{
					singleElement = singleElement ^ arrayToBeSearched[counter];
				}
				System.out.println("the single element is "+ singleElement);

				}
			}
		}
	}*/

	
	
	/*public void makeLastNodeHead() {
		// TODO Auto-generated method stub
		/* 1.head is null
		 * 2.one node
		 * 3.many nodes
		 
		if(linkList.head != null)
		{
			if(linkList.head.nextNode != null)
			{
				Node nodeToBeTraversed = linkList.head;
				Node tempNode = null;
				while(nodeToBeTraversed.nextNode != null)
				{
					tempNode = nodeToBeTraversed;
					nodeToBeTraversed = nodeToBeTraversed.nextNode;
				}
				nodeToBeTraversed.nextNode = linkList.head;
				tempNode.nextNode = null;
				linkList.head = nodeToBeTraversed;
			}
			}
		}*/
	/*public void deleteAnyNodeFromEnd(int position) {
		// TODO Auto-generated method stub
		/*
		 * 1.head is null
		 * 2.one node delete position 1
		 * 3. position not found
		 * 4. many nodes
		 
		if(linkList.head != null)
		{
			if(linkList.head.nextNode == null)
			{
				if( position == 1)
				linkList.head = null;
				else
					System.out.println("position not found");
			}
			else {
				 Node fastPointer = this.linkList.head.nextNode;
		           Node slowPointer = this.linkList.head;
		           int linkListLength = 2;
		           int mid = 1;
		           while(fastPointer.nextNode != null) {
				 
		        	   slowPointer = slowPointer.nextNode;
		        	   mid++;
		        	   fastPointer = fastPointer.nextNode;
			  		   linkListLength++;
		        	   if(fastPointer.nextNode != null) {
		        		   fastPointer = fastPointer.nextNode;
		        		   	linkListLength++;
		        	   }  
		           }
		           
		           if(position > linkListLength)
		        	   System.out.println("position out of bound");
		           int nodeNumber = linkListLength - position +1;
		           if(nodeNumber == 1)
		        	   linkList.head = linkList.head.nextNode;
		           int startPoint = 1, endPoint = mid;
		           Node nodeToBeTraversed = linkList.head;
		           Node tempNode = linkList.head;
		           if(nodeNumber > mid)
		           {
		        	   startPoint = mid+1;
		        	   endPoint = linkListLength;
		        	   nodeToBeTraversed = slowPointer;
			            tempNode = slowPointer;

		           }
		           while(startPoint < endPoint)
		           {
		        	   tempNode = nodeToBeTraversed;
		        	   nodeToBeTraversed = nodeToBeTraversed.nextNode;
		        	   if(startPoint == nodeNumber)
		        		   tempNode.nextNode = nodeToBeTraversed.nextNode;
		        	   startPoint ++;
		        	   
		           }*/
		         
		           
		         
	/*public void reversedLinkList() {
		// TODO Auto-generated method stub
		/*1.head is null
		 * 2.one node 
		 * 3.many nodes
		 
		if(this.linkList.head != null)
		{
			if(this.linkList.head.nextNode == null )
			{
				System.out.println("already a reverse");
			}
			
			else {
				Node  nodeToBeTraversed = this.linkList.head;
				Node  tempNode = this.linkList.head;
				Node  previousNode = null;
				   while(nodeToBeTraversed != null)
				   {
					   tempNode = nodeToBeTraversed;
					   nodeToBeTraversed = nodeToBeTraversed.nextNode;
					   tempNode.nextNode = previousNode;
					   previousNode = tempNode;
				   }
				   this.linkList.head = tempNode;
			}
		}
	}
	
}

	public void getMid()
	{
		// TODO Auto-generated method stub
		/*
		 *1. head is null
		 *2. one node
		 *3. many nodes
		 
		if(this.linkList.head!=null)
		{
			if(this.linkList.head.nextNode == null) {
				System.out.println("no mid");
			}
			else {
		           Node fastPointer = this.linkList.head.nextNode;
		           Node slowPointer = this.linkList.head;
		           int linkListLength = 0;
		           while(fastPointer.nextNode !=null) {
				 
		        	   slowPointer = slowPointer.nextNode;
		        	   fastPointer = fastPointer.nextNode;
			  		   linkListLength++;
		        	   if(fastPointer.nextNode != null) {
		        		   fastPointer = fastPointer.nextNode;
		        		   	linkListLength++;
		        	   }
		        	   
		           }
		           System.out.println(slowPointer.data + " is the mid");
		           
				}
		}
	}
}*/
  