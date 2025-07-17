package day12;

public class Dog1 extends Animal{
	public void eat() {
		System.out.println("Dog  is veg");
	}
	public void type() {
		System.out.println("It is pet animal");
	}
	
	
	public static void main(String[] args) {
		Dog1 d1=new Dog1();
		d1.eat();
		d1.type();
		Cat c1=new Cat();
		c1.eat();
		c1.type();
		
	}
}
//cat class
class Cat extends Animal{
	public void eat() {
		System.out.println("Cat is veg");
	}
	public void type() {
		System.out.println("It is pet animal");
	}
}
//Tiger class
class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger is non-veg");
	}
	public void type() {
		System.out.println("It is Wild Animal");
	}
}
//Lion class
class Lion extends Animal{
	public void eat() {
		System.out.println("Lion  is non-veg");
	}
	public void type() {
		System.out.println("it is wild animal");
	}
}
//Ox class
class Ox extends Animal{
	public void eat() {
		System.out.println("Ox is veg");
	}
	public void type() {
		System.out.println("IT is pet animal");
	}
}
//Abstract class
abstract class Animal extends Type{
	public abstract  void eat();
	
}

abstract class Type{
	public abstract void type();
}