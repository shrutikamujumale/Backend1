package day17;

import java.util.ArrayList;

public class Array1 {

	
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("Shrutika");
		arr1.add("Yash");
		arr1.add("Harsh");
		arr1.add("Sumit");
		System.out.println(arr1);
		arr1.remove(3);
		System.out.println(arr1);
		
		arr1.set(1, "Yashraj");
		System.out.println(arr1);
		
		
	}
}
