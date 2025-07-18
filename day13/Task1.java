package day13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int a1=sc.nextInt();
//		int b1=sc.nextInt();
//	
//		One o=new One();
//		o.m1(a1, b1);
		
		
				try {
				System.out.println("Enter the number");
				int c1=sc.nextInt();
				int result=c1*c1;
				System.out.println("The Square is "+c1+"*"+c1+"="+result);
			}catch(Exception e) {
				e.getMessage();
				e.printStackTrace();
				System.out.println("please enter valid number ");
			}
			
		
		
	}

}
// ArithmeticException
//class One{
//	public void m1(int a1, int b1) {
//		try {
//			int result=a1/b1;
////			if user divide any a1 value by b1 of value 0 then arithmetic exception occurs
//			System.out.println("The result is "+result);
//		}catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//			System.out.println("do not enter zero input valid number");
//		}
//	}
//	
//}

//**InputMismatchException**

