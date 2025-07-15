package day8_Inheritamce;

public class Four extends Five{
	
	public void prime(int a1) {
		if(a1!=0) {
			if(a1%2==0) {
				System.out.println(a1+" is not a prime number");
			}
			else {
				if(a1%a1-1==0) {
					System.out.println(a1+" is not a prime number");
				}
				else {
					System.out.println(a1+" is a prime number");
				}
			}
		}
		else {
			System.out.println(a1+" not valid");
		}
		}
	
}
