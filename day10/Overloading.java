package day10;

import java.util.Scanner;

public class Overloading {

	public static void m1(int a1) {
		if(a1%2==0) {
			System.out.println(a1+" number is even");
		}
		else {
			System.out.println(a1+" number is odd");
		}
	}
	
	public static void m1(int a1, String c1) {
		int square1=a1*a1;
		System.out.println("The square is"+square1);
		for(char i=0;i<=5;i++) {
			System.out.println("Your name is : "+c1);
		}
	}
	public static void m1(int a1, int b1) {
		int sum=a1+b1;
		System.out.println("The sum is :"+sum);
	}
	public static void m1(String c1, int a1 ) {
		for(char i=0;i<=5;i++) {
			System.out.println("Your Name is "+c1+" and Age is"+a1);
			
		}
	
	}
	public static void m1(double d1, double t1) {
		double speed=d1/t1;
		System.out.println("The speed is of  distenace "+d1+" and time "+t1+" is :"+speed+"m/s");
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value :");
//		int a1=sc.nextInt();
//		int b1=sc.nextInt();
//		System.out.println("Your Name:");
//		String c1 =sc.next();
		System.out.println("Enter the distance");
		double d1=sc.nextDouble();
		System.out.println("Enter the time");
		double t1=sc.nextDouble();
		
//		m1(a1);
//		m1(a1,c1);
//		m1(a1,b1);
//		m1(c1,a1);
		m1(d1,t1);
		
	}
}
