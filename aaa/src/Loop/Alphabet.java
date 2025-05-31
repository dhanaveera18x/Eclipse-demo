package Loop;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char a,b;
		System.out.println("enter the starting point:");
		a=scan.next().charAt(0);
		System.out.println("enter the starting point:");
		b=scan.next().charAt(0);
		for(a='a',b='z';a<=b;a++)
			System.out.println(a);
		

	}

}
