package Loop;

import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
		int i,j,s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter i");
		
		
		for(i=scan.nextInt(),j=1,s=0;i>=j;i--) {
			s=s+i;
		}
		
		System.out.println(s);
			
		// TODO Auto-generated method stub

	}

}
