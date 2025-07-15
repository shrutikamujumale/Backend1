package day10;

import java.util.Scanner;

public class Overriding {

	public static void m2(int a1) {
		if (a1 > 0) {
			System.out.println(a1 + " is a positive number");
		} else {
			System.out.println(a1 + "is a negative number");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a1 = sc.nextInt();
//		int b1 = sc.nextInt();
		
		m2(a1);
		overriding2.m2(a1);
		
	}
	
}
 class overriding2{
	
	 public static void m2(int a1) {
		 if(a1!=0) {
			if(a1%2==0) {
				System.out.println(a1+" is not a prime number");
			}
			else {
				if(a1%a1-1==0) {
					System.out.println(a1+" is not a prime number");
				}
				else {
					System.out.println(a1+" is a prime number");
				}
			}
		 }
		 else {
			 System.out.println("invalid");
		 }
		
	 }
}
 