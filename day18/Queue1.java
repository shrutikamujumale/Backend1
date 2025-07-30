package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Queue1 {

public static void main(String[] args) {
//	List 
	System.out.println("List");
	List <String> l1=new ArrayList<>();
	l1.add("Shrutika");
	l1.add("Sita");
	l1.add("ram");
	
//	for(String a1:l1) {
//		System.out.println(a1);
//	}
	System.out.println(l1);
	
	
	
///set
		System.out.println("Set");
		Set <String> s1= new HashSet<>();
		s1.add("one");
		s1.add("Two");
		s1.add("Three");
		System.out.println(s1);
		
		
// Map
		System.out.println("Map");
		Map <Integer,String> m1=new HashMap<>();
		m1.put(1,"Shrutika");
		m1.put(2, "Geeta");
		m1.put(3, "Riya");
		m1.put(2, "diya");
		System.out.println(m1);
		
// Queue
		System.out.println("Queue");
		Queue <String> q1=new LinkedList<>();
		q1.add("Shrutika");
		q1.add("Isha");
		q1.add("Siya");
		System.out.println(q1);
		
}


	
}
