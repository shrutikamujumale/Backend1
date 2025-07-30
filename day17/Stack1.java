package day17;
 import java.util.Stack;

public class Stack1 {
		
	
	public static void main(String[] args) {
		
		Stack<String> str=new Stack<>();
		str.push("Shrutika");
		str.push("Shweta");
		str.push("riya");
		str.push("kunjan");
		str.push("geeta");
		
		System.out.println(str);
		
		str.pop();
		System.out.println(str);
		
		str.set(3, "vKunjan");
		System.out.println(str);
		
		
		System.out.println(str.peek());
		

		
		System.out.println(str.get(2));
		
//		str.clear();
//		System.out.println(str);

	}
}
