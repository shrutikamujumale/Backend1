package day9;

public class ClassG extends ClassB{

		
		public void ascii() {
			for(char i='A'; i <='Z'; i++ ) {
				int j =  i;
				System.out.print(i+" " +j +"  ");
			}
			System.out.println("");
			System.out.println("");
			for(char i='a'; i <='z'; i++ ) {
				int j =  i;
				System.out.print(i+" " +j +"  ");
			}
		}
}
