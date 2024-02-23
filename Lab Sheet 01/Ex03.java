package Ex03;
import Ex01.StackX;

public class bracketCheck {

	private String inputStr;
	
	//constructor implementation
	public bracketCheck(String in) {
		inputStr = in;  // 3 + ((6 * 2) - 3)
	}
	
	public void checkB() {
		
		int size = inputStr.length();  //11
		StackX stack = new StackX(size); //max size = 11
		
		for(int i=0; i<size; i++) {
			if(inputStr.charAt(i) == '(') {
				stack.push('(');
			}
			else if(inputStr.charAt(i) == ')') {
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			System.out.println("Invalid String");
		}
		else {
			System.out.println("Valid String");
		}	
	}
}

package Ex03;

public class Main {

	public static void main(String[] args) {
		
		bracketCheck bracketCheck = new bracketCheck("3 + ((6 * 2) - 3)");
		bracketCheck.checkB();
		
	}

}

