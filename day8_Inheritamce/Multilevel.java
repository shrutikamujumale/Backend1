package day8_Inheritamce;

import java.util.Scanner;

public class Multilevel extends One{

	public void fun1() {
		System.out.println("Multilevel inheritance");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		
		Multilevel m1=new Multilevel();
//		m1.pon(a1);
//		m1.even(a1);
//		m1.Add(b1, c1);
//		m1.prime(a1);
//		m1.pattern(a1);
//		m1.table(a1);
//		m1.loop(a1);
//		m1.loop2(a1,b1,c1);
//		m1.array2(d1);
//		m1.division(a1, b1);
		m1.Array2D();
	}
}
