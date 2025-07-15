package day3;

import java.util.Scanner;

public class operator1 {
	public static void main(String[] args) {
		
//		aritmetic operator
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter two no:");
//		
//		int one =sc.nextInt();
//		int two =sc.nextInt();
//		
//		int add=one+two;
//		System.out.println("addition of two number"+one+two+"is :"+add);
//		int sub=one-two;
//		System.out.println("subtration of two number"+one+two+"is :"+sub);
//		int mul=one*two;
//		System.out.println("multiplication of two number"+one+two+"is :"+mul);
//		int div=one/two;
//		System.out.println("division of two number"+one+two+"is :"+div);
//		int mod=one%two;
//		System.out.println("mod of two number"+one+two+"is :"+mod);
		

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no:");
//		int num=sc.nextInt();
//		if(num%2==0) {
//			System.out.println("the number is even");
//		}
//		else {
//			System.out.println("number is odd");
//		}
//		
		
		
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no:");
//		
//		int num=sc.nextInt();
//		if(num!=0) {
//			if(num>0) {
//				System.out.println("the number "+num+" is positive");
//			}
//			else {
//				System.out.println("the number "+num+" is negative");
//			}
//		}
//		else {
//			System.out.println("something went wrong");
//		}
		
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int num=sc.nextInt();
		if(num!=0) {
			if(num%2==0) {
				System.out.println("the number "+num+" is it is not prime");
			}
			else {
				
				if(num%num-1==0) {
					System.out.println("this is not a prime number");
				}
				else {
					System.out.println("it is a prime number");
				}
			}
		}
		else {
			System.out.println("invalid");
		}
		
		
	}
}
