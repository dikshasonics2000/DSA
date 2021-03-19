package hello;

public class CustomRecursions{
	private CustomLinkList linkList;
	private CustomLinkList linkList1;
 
public CustomRecursions(CustomLinkList linkList) {
	this.linkList = linkList;
}
public void reverseLinkList(Node head, Node tempNode, Node previousNode) {
	// TODO Auto-generated method stub
	/*
	 * 1.head is null 
	 * 2.one node
	 * 3.many nodes
	 */
	if(linkList.head == null)
	{
		linkList.head = tempNode;
		return;
	}
	else
	{
		tempNode = linkList.head;
		linkList.head = linkList.head.nextNode;

		tempNode.nextNode = previousNode;
		previousNode = tempNode;
		reverseLinkList(linkList.head, tempNode, previousNode);
	}
}

}

/*public void traverseLinkList(Node head) {
	// TODO Auto-generated method stub
	/*
	 * 1.head is null
	 * 2. one node
	 * 3. many nodes
	 
	if(head == null)
		return;
	else {
		System.out.println(head.data);
		traverseLinkList(head.nextNode);
		
	}
}
}*/
/*public int addNode(Node head) {
	// TODO Auto-generated method stub
	/*
	 * 1.head is null;
	 * 2.one or many nodes
	 
	if(head == null)
	{
		return 0;
	}
	else {
		return (addNode(head.nextNode) + head.data);
}
}

}*/
/*public void insertAtEnd(Node head, int dataToBeInserted) {
	// TODO Auto-generated method stub
	/*
	 * 1. head is null
	 * 2.one node
	 * 3.many nodes
	 
	if(head == null)
	{
		return;
	}
	else {
		if(head.nextNode == null)
		{
			Node newNode = new Node(dataToBeInserted);
			head.nextNode = newNode;
		    return;
		}
		
		insertAtEnd(head.nextNode, dataToBeInserted);
	}
}
}*/

