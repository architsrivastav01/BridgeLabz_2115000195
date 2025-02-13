
import java.util.Stack;
public class SortStackByRecursion {
	public static void main(String [] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(8);
		st.push(5);
		st.push(2);
		st.push(4);
		st.push(3);
		
		sortstack(st);		
		while(!st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}
	}
	
	private static void sortstack(Stack<Integer> st) {
		if(!st.isEmpty()) {
			int temp = st.pop();
			sortstack(st);
			insert(st, temp);
		}
	}
	
	private static void insert(Stack<Integer> st, int temp) {
		if (st.isEmpty() || st.peek() <= temp) {
           st.push(temp);
       } else {
           int x = st.pop();
           insert(st, temp);
           st.push(x);
       }
	}
}

