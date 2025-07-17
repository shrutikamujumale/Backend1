package day11;

import java.util.Scanner;

public class Encapsulation {

	private String name;

	private int age;

	private double marks;

//	String name Getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; // "this "keyword is reference of object e
	}

//	Voting age
	public int getAge(int a) {
		int age1=a;
		return age1;
	}
	public void setAge(int a) {
		if(a>=18) {
			this.age=age;
			System.out.println("Your are eligible for voting");
		}
		else {
			System.out.println("Your are not aligible for voting");
		}
	}
	
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
//		e.setName("Shrutika");
//		System.out.println("Name is :" + e.getName());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int a=sc.nextInt();
		e.setAge(a);
		int result=e.getAge(a);
		System.out.println(result);
	}
}
