package dataStructureAndAlgo;

public class CustomStack{
		
		private  int[] stack = new int[10];
		int top = -1;
        public static void main(String args[]) 
        {
    		CustomStack stack = new CustomStack();
    		
           stack.push(6);
           stack.push(8);
           stack.push(9);
           stack.push(4);
           stack.push(8);

			System.out.println(stack.pop());
			System.out.println(stack.pop());


        }
		
			
		
		
		public void push(int dataToBePushed ) {
		// TODO Auto-generated method stub
		/*
		 * 1.stack is null
		 * 2.stack has one element
		 * 3.stack has many element
		 * 4.stack is full
		 */
			    top++;
				stack[top] =dataToBePushed; 
			
				
				for(int counter = 0;counter <=top;counter++)
			     {
					System.out.print(stack[counter] + " ");
			     }
				System.out.println();

	}
		public int pop()
		{
			if(top != -1)
			{
			top--;
			return stack[top+1];
		}
			else
				System.out.println("stack underflow");
			return top;
       }
}