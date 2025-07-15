package day2;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Your name is :"+name);
		
		System.out.println("Enter your age:");
		int ageone = sc.nextInt();
		System.out.println("Your age is :"+ageone);
		
		
		System.out.println("Enter your Name :");
		String nametwo =sc.next();
		System.out.println("your name is:"+nametwo);
		
		System.out.println("Enter your age :");
		int agetwo = sc.nextInt();
		System.out.println("Your age is"+agetwo);
		
		int sum=ageone+agetwo;
		System.out.println("Sum of Age is:"+sum);
		
		
		
		
		
		
		
	}
}
