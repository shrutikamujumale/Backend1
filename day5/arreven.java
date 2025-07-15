package day5;

public class arreven {
	public static void main(String[] args) {
		 int arr1[]= {2,5,6,8,9,12,56,44,77,83};
		 for(int i=0;i<=arr1.length;i++) {
			 if(arr1[i]%2==0) {
				 System.out.println("index :"+i+" even value :"+arr1[i]);
			 }
			 else {
				 System.out.println("index :"+i+" odd value:"+arr1[i]);
			 }
		 }
	}
}
//exception : ArrayIndexOutofBoundException occurs when we mention "i"<= in for loop
//or if we use i=1 then reduce length-1