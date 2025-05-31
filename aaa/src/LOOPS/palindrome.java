package LOOPS;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("num");
		int a,b,d,c;
		for(a=scan.nextInt(),c=a,b=0,d=0;a>0;)
		{
			b=a%10;
			a=a/10;
			d=d*10+b;
			
		}
			if(c==d) {
				System.out.println("palindrome");
			}
			else {
				System.out.println(" not palindrome");
			}			
		// TODO Auto-generated method stub

	}

}

