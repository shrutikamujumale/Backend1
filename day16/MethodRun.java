package day16;

public class MethodRun extends Thread{

		
		public void run() {
			for(int i=1;i<=100;i++) {
				if(i%2==0) {
				
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
			}
		}
		
		
		
		
		
		
		public static void main(String[]  args) {
			
			MethodRun  r1=new MethodRun();
			r1.start();
		}
	}


