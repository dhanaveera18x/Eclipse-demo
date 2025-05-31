package V18;

import java.util.Scanner;

public class sumofoddnumber {

	public static void main(String[] args) {
		int i,s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter i");
		
		
		for(i=scan.nextInt(),s=0;i>0;i--)
		{
			if(i%2!=0)
			s=s+i;
		}
		
		System.out.println(s);
			
		// TODO Auto-generated method stub

	}

}
