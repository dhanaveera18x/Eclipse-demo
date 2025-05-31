package veera;

import java.util.Scanner;

public class Largestof3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num:");
		a=scan.nextInt();
		System.out.println("enter the num:");
		b=scan.nextInt();
		System.out.println("enter the num:");
		c=scan.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			
			}
			else 
			{
				System.out.println("");
			}
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		// TODO Auto-generated method stub

	}

}
