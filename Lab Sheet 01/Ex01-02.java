public class StackX {

	//declaring the variables
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	//constructor
	public StackX(int s) {
		this.maxSize = s;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//isFull
	public boolean isFull() {
			return (top == maxSize - 1);
	}
	
	//push Method -- Insert Method
	public void push(char ch) {
		if(!isFull())
			stackArray[++top] = ch;
		else
			System.out.println("Stack is Full");
	}
	
	//pop Method -- Remove the Top Element
	public char pop() {
		if(!isEmpty())
			return stackArray[top--];
		else
			System.out.println("Stack is Empty");
		
		return 0;
	}
	
	//peek Method -- Read Element
	public char peek() {
		if(!isEmpty())
			return stackArray[top];
		else
			return 0;
	}
	
	//Print the Stack Elements
	public void display() {
		System.out.println("Printing the Stack Elements");
		
		int i = top;
		
		do {
			System.out.println(stackArray[i] + " ");
			i--;
		} while (i >= 0);
	}
			
}


public class MainApp {

	public static void main(String[] args) {
		
		StackX stack = new StackX(5);
		
		stack.push('S');
		stack.push('T');
		stack.push('A');
		stack.push('C');
		stack.push('K');
		
		stack.display();
		System.out.println("\n");
		System.out.println("Peek Value is : " + stack.peek());
		System.out.println("\n");
		
		while(!stack.isEmpty()) {
			
			char ch2 = stack.pop();
			System.out.println("Top Deleted Value : " + ch2);
			
		}

	}

}


















