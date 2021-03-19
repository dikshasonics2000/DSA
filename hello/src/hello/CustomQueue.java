package hello;

public class CustomQueue implements IQueue {
	private int[] queue = new int[6];
	int front = -1;
	int rear = -1;
	public static void main(String args[])
	{
		IQueue queue = new CustomQueue();
		queue.push(6);
		queue.push(8);
		queue.push(9);
		queue.push(4);
		queue.push(8);
		queue.push(2);
		queue.pop();
		queue.pop();
		queue.pop();


	}
	@Override
	public int pop() {
		int data = 0;
		// TODO Auto-generated method stub
		if(front == -1 && rear == -1)
		{
			System.out.println("queue underflow");
		}
		else if(front == rear)
		{
			data = queue[front];
			System.out.println(queue[front]);
			front = -1;
			rear = -1;
			return data;
		}
		else
		{
			data = queue[front];
			System.out.println(queue[front]);
			front = (front+1)%queue.length;
		}
		return data;
	}

	@Override
	public void push(int dataToBeInserted) {
		// TODO Auto-generated method stub
		if(front == -1 && rear == -1)
		{
			front = rear = 0;
			queue[rear] = dataToBeInserted;
		}
		else if((rear+1)%queue.length == front)
		{
			System.out.println("queue overflow");
		}
		else
		{
			rear = (rear+1)%queue.length;
			queue[rear] = dataToBeInserted;


		}
		for(int counter = (front+1)%queue.length; counter <= rear; counter++)
		{
			System.out.print(queue[counter]+ " ");
		}
		System.out.println();


	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(rear == -1)
			return true;

		return false;
	}
}
