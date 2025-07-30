package library;

import java.util.ArrayList;
import java.util.Scanner;


public class Library1 extends Add1{


		
	
	public static void main(String[] args) {
		 Library1 l1=new Library1();
		
		while(true) {
			
		System.out.println("1 : add a book");
		System.out.println("2 : delete a book");
		System.out.println("3 : Find the book");
		System.out.println("4 : add more books in list");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your Choice");
		 
		 int a1=sc.nextInt();
		 
		
		 
		 if(a1==1) {
			 l1.addbook();
		 }
		 else if(a1==2) {
			 l1.deletebook();
		 }
		 else if(a1==3) {
			 l1.findbook();
		 }
		 else if(a1==4) {
			 l1.editlist();
			 return;
		 }
		 else {
			 System.out.println("Wrong choice");
		 }
		}
	}
}

class Add1 extends Delete1{

	
	
	public void addbook() {
		Scanner sc1=new Scanner(System.in);
		
		
		System.out.println("No. of Books you want :");
		int size1=sc1.nextInt();
		
		System.out.println("Enter the Name of books :");
		for(int i=0;i<size1;i++) {
			
			String name1=sc1.next();
			arr1.add(name1);
			
		}
		System.out.println(arr1);

	}
}
	
class Delete1 extends Find1{
	
	
	public void deletebook() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Which book do you want to delete");
		String d1=sc2.next();
		if(arr1.remove(d1)) {
			System.out.println(d1+ "is remove from list");
			System.out.println(arr1);
		}
		else {
			System.out.println(d1+" book is  not present ");
			System.out.println(arr1);
		}
	}
}

class Find1 extends Edit1{

	public void findbook() {
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the name of a book you want to find");
		String f1=sc3.next();
		
		if(arr1.contains(f1)) {
			System.out.println(arr1);
			System.out.println(f1+" is present in list ");
		}
		else {
			System.out.println(f1+" is not present in  list");
		}
	}
	
}

class Edit1{
	public ArrayList<String> arr1=new ArrayList<>();
	public void editlist() {
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter name of book you want to add in list :");
		String e1=sc4.next();
		System.out.println(arr1.add(e1));
		System.out.println(arr1);
	}
}
