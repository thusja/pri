import java.util.EmptyStackException;
import java.util.Stack;

/// 2022.10.11

public class stackTest {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.push("1");
		st.push("2");
		st.push("3");
		
		try {
     	System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		}
		catch(EmptyStackException e) {
			System.out.println("Stack이 비어있습니다");
		}
		

		while(!st.empty()) {
			System.out.println((String)st.pop());
		}
		
		
		
	}

}
