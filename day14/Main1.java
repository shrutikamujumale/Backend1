package day14;

import java.util.Scanner;

public class Main1 {

	public static void CheckMarks(int mark)throws InvalidMarkException{
		if(mark<0 ||mark>100) {
			throw new InvalidMarkException("Mark should be beetween o to 100");
		}
		else {
			System.out.println("valid marks "+mark);
		}
	
	}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Marks ");
			int mark=sc.nextInt();
			
				CheckMarks(mark);
		}catch(InvalidMarkException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
}


class InvalidMarkException extends Exception{

	public InvalidMarkException(String msg) {
		super(msg);
	}
};