package day16Hw;



public class Racedemo {
	
	
	
	public static void main(String[] args) {
		
		Turtle t= new Turtle();
		Rabbit r=new Rabbit();
		t.start();
		try {
			t.join(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		r.start();
		
		
	}
	
}
class Rabbit extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Rabbit: "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		System.out.println("Rabbit Finished race!!");
	}
}
class Turtle extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++) {
			System.out.println("Turtle : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	System.out.println(" Turtle Finished race !!");
	}
}