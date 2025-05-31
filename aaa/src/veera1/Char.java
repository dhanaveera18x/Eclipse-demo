package veera;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		char a;
		char b;
		char c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=scan.next().charAt(0);
		System.out.println("enter the symbol:");
		b=scan.next().charAt(0);
		System.out.println("enter the  second number:");
		c=scan.next().charAt(0);
		if((a=='+' &&  b=='*'&& c=='+')||(a=='-' && b=='*'&& c=='-'))
	       System.out.println("+");
	    else if((a=='-' && b=='*'&& c=='+')||(a=='+' && b=='*'&& c=='-'))
		   System.out.println("-");
	    else
		    System.out.println("invalid");
	    scan.close();
		// TODO Auto-generated method stub

	}

}
