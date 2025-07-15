package day6;

import java.util.Scanner;

public class static_array {
	public static void main(String[] args) {
//		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the size :");
//		int size=sc.nextInt();
//		
//		System.out.println("Enter the values");
//		int arr1[]=new int[size];
//		for(int i=0;i<size;i++) {
//			System.out.println("index"+i);
//			arr1[i]=sc.nextInt();
//		};
//		
//		for(int i=0;i<size;i++) {
//			
//				System.out.println(arr1[i]);
//
//			
//		}
		
//		2d array dynamic array
		
//		Scanner sc=new Scanner(System.in);
//		int arr1[][]= {
//				{1,2},
//				{3,4,5}
//				};
//	
//		System.out.println("enter the value");
//		int num1=sc.nextInt();
//		for(int i=0;i<arr1.length;i++) {
//			
//			for(int j=0;j<arr1.length;j++) {
//				if(arr1[i][j]!=num1) {
//					System.out.println("it is present");
//				}
//				else {
//					System.out.println("it is not present");
//				}
//			}
//		}
//		
//		static array 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int value=sc.nextInt();
		
		int size=0;
		int arr1[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println(i);
			arr1[i]=sc.nextInt();
		};
		for(int i=0;i<size;i++) {
			System.out.println(arr1[i]);
		}
	}
}
