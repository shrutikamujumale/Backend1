package day7;

import java.util.Scanner;

public class functionstype {
	private static String b;
	private static String a;






	public static void fun1() {

		Scanner even1=new Scanner(System.in);
		System.out.println("enter the number:");
		int num1=even1.nextInt();
			if(num1%2==0) {
				System.out.println(num1+" is even number");
			}
			else {
				System.out.println(num1+" is odd number");
			}
		
//		
	}
	public static void fun2() {
		
//		return a+b;
		Scanner sum1=new Scanner(System.in);
		System.out.println("give two numbers");
		int a=sum1.nextInt();
		int b=sum1.nextInt();
		int result=a+b;
		System.out.println("the sum of two number "+a+" & "+b+" is :"+result);
				
	}
	
	public static void fun3() {
		
		Scanner star1=new Scanner(System.in);
		System.out.println("Enter the number :");
		int star2=star1.nextInt();
		for(int i=0;i<=star2;i++) {
			for(int j=1;j<=star2;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	public static void fun4() {
		Scanner arr1=new Scanner(System.in);	
		System.out.println("enter friuts");
		
		String arr2 []=new String[5];
		for(int i=0;i<5;i++) {
			arr2[i]=arr1.next();
			
		}
		for(int i=0;i<5;i++) {
			System.out.println(arr2[i]);
		}
	}
	public static void fun5() {
		Scanner prime1=new Scanner(System.in);
		System.out.println("Enter the number");
		int prime2=prime1.nextInt();
		if(prime2!=0) {
			if(prime2%2==0) {
				System.out.println(prime2+" is not a prime number");
			}
			else {
				if(prime2%prime2-1==0) {
					System.out.println(prime2+" is not a prime number");
				}
				else {
					System.out.println(prime2+" is a prime number");
				}
			}
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		

	
		System.out.println("1:find even or odd");
		System.out.println("2:Addition of two numbers");
		System.out.println("3:Star Pattern");
		System.out.println("4:list of fuits");
		System.out.println("5:find number prime or not");
		
		Scanner main1=new Scanner(System.in);
		System.out.println("Enter your choice:");
		
		int sc=main1.nextInt();
	
			if(sc==0) {
				System.out.println("invalid");
			}
			else if(sc==1) {
				fun1();
			}
			else if(sc==2) {
				fun2();
			}
			else if(sc==3) {
				fun3();
			}
			else if(sc==4) {
				fun4();
			}
			else if(sc==5) {
				fun5();
			}
		
	}
}
