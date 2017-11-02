public class StackX {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public StackX(int s) //constructor
	{
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public void push(int j)//put item on top of stack
	{
		stackArray[++top] = j;
	
	}
	
	public int pop(){
		return stackArray[top--];
	}
	
	public int peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
}