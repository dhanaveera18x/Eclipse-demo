package LOOPS;

import java.util.Scanner;

public class multiplynnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("first number:");
		int a,b,c;
		for(a=scan.nextInt(),b=0,c=1;a>0;)
		{
			b=a%10;
			a=a/10;
			c=c/b;
		}
		System.out.println(c);

	}

}
