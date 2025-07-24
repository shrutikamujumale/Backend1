package day16Hw;

public class Names1 extends Thread{
	
	
	
//	public void alphabet() {
//		for(char i='A';i<='Z';i++) {
//
//			int value=i;
//			System.out.println(i+" "+value);
//		}
//	}
	

	public void race1() {
		char arr1[]= {82,65,66,66,73,84};
		for(char myname1:arr1) {
			System.out.print(myname1);
		}
		System.out.print(" ");
		char arr2[]= {84,85,82,84,76,69};
		for(char myname2:arr2) {
			System.out.print(myname2);
		}
	}
	
	public static void main(String[] args) {
		
		Names1 r1=new Names1();
//		r1.alphabet();
		r1.race1();
	}
	
}
