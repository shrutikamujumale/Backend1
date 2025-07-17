package day12;

public class ExternalAbstraction extends Animal {
   public static void main(String[] args) {
	   Animal a = new ExternalAbstraction();
	   a.eat();
	   a.type();
}

   public void eat() {
	System.out.println("Veg");
	
   }

   @Override
   public void type() {
	System.out.println("pet animal");
	
   }
}
