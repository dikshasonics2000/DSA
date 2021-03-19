package hello;

public class CustomStackUsingQueue {

	IQueue queue1 = new CustomQueueUsingLinkList();
	IQueue queue2 = new CustomQueue();

	public static void main(String args[])
	{
		CustomStackUsingQueue customStackUsingQueue = new CustomStackUsingQueue();
		customStackUsingQueue.push(1);
		customStackUsingQueue.push(2);
		customStackUsingQueue.push(3);

		// print elements of stack

		customStackUsingQueue.pop();

		customStackUsingQueue.push(4);
		customStackUsingQueue.push(5);
		// print no of elements in stack.


		customStackUsingQueue.pop();

		// print elements of stack
	}



	public void push(int dataToBePushed) {
		// TODO Auto-generated method stub
		if(queue1.isEmpty() && queue2.isEmpty())
		{
			queue1.push(dataToBePushed) ; 
		} 
		else if(queue2.isEmpty())
		{
			queue1.push(dataToBePushed) ; 
		}
		else
			queue2.push(dataToBePushed) ; 
	}



	public int pop() {
		int data = 0;
		if(queue1.isEmpty() && queue2.isEmpty())
		{
			System.out.println("queue is empty");

		}
		
		IQueue sourceQueue = queue1;
		IQueue destinationQueue = queue2;
		
		if(queue1.isEmpty())
		{
			sourceQueue = queue2;
			destinationQueue = queue1;
		}

			while(!sourceQueue.isEmpty())
			{
				data = sourceQueue.pop();
				if(!sourceQueue.isEmpty())
					destinationQueue.push(data);
			}
		return data;		
	}

}