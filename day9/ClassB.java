package day9;

public class ClassB extends ClassC{

	public void threeD() {
		int arr[][][] = {
				{
					{100,200,300,400},
					{500,600,700,800},
					{900,1000,1100,1200}
				}
		};
		System.out.println(arr[0][2][3]);
	}
}
