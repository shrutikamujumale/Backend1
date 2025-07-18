package day13;

import java.util.Scanner;

public class TryCatchException1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		
//		int a1=sc.nextInt();
		
//		One o=new One();
//		o.m1(a1);
		
			
				try {
					
					int arr1[]=new int[5];
					for(int i=0;i<=arr1.length;i++) {
					arr1[i]= sc.nextInt();
					}
					
				}catch(Exception e) {
					e.getMessage();
					e.printStackTrace();
					System.out.println("Somthing is wrong !!");
				}
			}

		
	
}
//**Without try catch block **

// class One{
//	 public  void m1(int a1) {
//		 int arr1[]= {1,2,3,4,5};
//		 System.out.println(arr1[a1]);
//	 }
// }


//**with try catch block**

//class One{
//	public void m1(int a1) {
//		try {
//			int arr1[]= {1,2,3,4,5,6,7};
//			System.out.println(arr1[a1]);
//		}catch(Exception e) {
////			e.getMessage();
////			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
//}

