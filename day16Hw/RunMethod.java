package day16Hw;

public class RunMethod extends Thread{
//run  method for 1 to 100 number
	public void run() {
		System.out.println(" The Number from 1 to 100");
		for(int i=1;i<=100;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
//	even and odd numbers from  1 to 20
	public void even() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(i+" even number");
			}
			else {
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(i+" odd number");
			}
		}
	}
	
// countdown 10 to 1
	public void countdowns() {
		for(int i=10;i>=1;i--) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.fillInStackTrace();
			}
			System.out.println(i);
		}
	}
	
//  alphabets A to Z
	public void alphabet() {
		System.out.println("Alphabates from A to Z");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.fillInStackTrace();
		}
		for(char i='A';i<='Z';i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.fillInStackTrace();
			}
			System.out.println(i);
		}
	}
	
//	number 1 to 26
	public void num1() {
		for(int i=1;i<=26;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.fillInStackTrace();
			}
			System.out.println(" number :"+i);
		}
	}
	
	public static void main(String[] args) {
		RunMethod r2=new RunMethod();
//		r2.start();
//		r2.even();
//		r2.countdowns();
		r2.alphabet();
//		r2.num1();
	}
}
