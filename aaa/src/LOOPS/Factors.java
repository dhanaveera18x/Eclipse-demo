package LOOPS;
import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("first number:");
		
		int a,b,c;
		for(a=scan.nextInt(),b=0,c=0;a>0;)
		{
			b=a%10;
			a=a/10;
			c=c+b;
			
			
		}
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
