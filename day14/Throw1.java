package day14;

import java.util.Scanner;

public class Throw1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<18) {
			throw new ArithmeticException("your are not applicable for Voting !!");
		}
		else {
			System.out.println("you are applicable for voting !!");
		}
	}
	
}
