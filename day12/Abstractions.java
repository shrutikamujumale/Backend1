package day12;

public class Abstractions extends One {
		public void m2() {
			System.out.println("This is the body less method");
		}
	
	public static void main(String[] args) {
		
		One o = new Abstractions();
		o.m1();
		o.m2();
	}

	
}

abstract class One{
	
	public void m1() {
		System.out.println("hello world");
	}
	
	public abstract void m2();
}