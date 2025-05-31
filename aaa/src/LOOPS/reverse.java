package LOOPS;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("first number:");
		int a,b,d;
		for(a=scan.nextInt(),b=0,d=0;a>0;)
		{
			b=a%10;
			a=a/10;
			d=d*10+b;
			
		}
			System.out.println(d);
		// TODO Auto-generated method stub

	}

}
