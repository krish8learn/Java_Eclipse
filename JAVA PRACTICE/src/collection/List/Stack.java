package collection.List;
import java.util.*;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Stack<Integer> st = new java.util.Stack<Integer>();
		st.push(1);
		st.push(3);
		st.add(7);
		st.push(45);
		System.out.println(st);
		System.out.println(st.search(2)); //not present return -1//
		System.out.println(st.search(1)); //return position//
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.empty());
	}

}
