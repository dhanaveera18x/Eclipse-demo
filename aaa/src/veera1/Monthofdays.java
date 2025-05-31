package veera;

import java.util.Scanner;


public class Monthofdays {
	
	

	
		public static void main(String[] args) {
			int a;
			
			Scanner scan=new Scanner(System.in);
		
			System.out.println("enter th character:");
			a=scan.nextInt();
			if(a==1||a==3||a==5||a==7||a==9||a==11)
				System.out.println("31 days");
			else if(a==2)
			System.out.println("28 days");
			else if(a>=12||a<=1)
			System.out.println("invalid");
			else
				System.out.println("30 days");
			scan.close();
			// TODO Auto-generated method stub

	
		// TODO Auto-generated method stub

	}

}
