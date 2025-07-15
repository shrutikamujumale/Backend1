package day8_Inheritamce;

public class Nine extends Ten{

	public void loop2(int a1,int b1,int c1) {
		int arr1[]= {a1,b1,c1};
		for(int arr2:arr1) {
			System.out.println(arr2);
			if(arr2>0) {
				System.out.println(arr2+"The all numbers are positive");
			}
			else {
				System.out.println(arr2+"The numbers are negative");
			}
		}
	}
}
