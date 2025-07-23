package day16;

import java.util.Scanner;

public class Threading1 extends Thread{

	
	
	public void m1(int a1) {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i+"x"+a1+" = "+i*a1);
		}
	}
	
	public void m2() {
		int arr1[]= {22,13,42,55,44,66,78,74,99};
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		for(int a:arr1) {
			System.out.println(a);
		}
	}
	
	
	Threading1(int a1){
		for(int i=0;i<=10;i++) {
			int result1=i+a1;
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i+"+"+a1+" ="+result1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number :");
		int a1=sc.nextInt();
		
		
		
		Threading1 t1=new Threading1(a1);
//		t1.m1(a1);
//		t1.m2();
	}
}
