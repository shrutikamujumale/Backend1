package day9;

import java.util.Scanner;

public class Interface1 extends ClassA implements F,N,O,X,Y{
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a1=sc.nextInt();
//		int b1=sc.nextInt();
//		int c1=sc.nextInt();

		
		Interface1 i=new Interface1();
//		i.pon(a1);
//		i.even(a1);
//		i.Add(b1, c1);
//		i.sub(b1, c1);
//		i.mul(b1, c1);
//		i.div(b1, c1);
//		i.prime(a1);
//		i.loop(a1);
//		i.Array2D();
//		i.pattern(a1);
//		i.array1();
//		i.table();
//		i.division(b1, c1);
//		i.multiple(a1);
//		i.ascii();
//		i.threeD();
//		i.products();
//		i.dowhileloop();
//		i.cube(a1);
		
		//interfaces		
//		i.forloop();
//		i.whileloop();
//		i.square(a1);
//		i.atoz();
		i.loop();
	}

	public void forloop() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	
		
	}

	public void whileloop() {
		int n=10;
		while(n<=15) {
			n+=1;
			System.out.println(n);
			
		}
		
	}
	

	public void square() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("The Square is:"+i*i);
		}
		
	}

	public void atoz() {
		for(int i='a';i<='z';i++) {
			System.out.println(i);
		}
		
	}

	public void loop() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thank you");
		}
	}







}
interface F{
	void forloop();
}
interface N{
	void whileloop();
}
interface O{
	void square();
}
interface X{
	void atoz();
}


interface Y{
	void loop();
}