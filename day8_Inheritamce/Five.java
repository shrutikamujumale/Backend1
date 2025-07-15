package day8_Inheritamce;

public class Five extends Six{

	public void pattern(int a1) {
		for(int i=0;i<=a1;i++) {
			for(int j=1;j<=a1;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
