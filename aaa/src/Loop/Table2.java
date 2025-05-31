package Loop;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,i,j,c;
		System.out.println("enter the base");
		a=scan.nextInt();
		for(i=1,j=10;i<=j;i++)
		{
			c=a*i;
			System.out.println("The Table For " +a+ " is " +a+"*"+i+ " = " +c);
			
		}
		
		// TODO Auto-generated method stub

	}

}
