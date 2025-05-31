package LOOPS;
import java.util.Scanner;

public class sumofnnum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("first number:");
		
		
		int a,b,c,x;
		for(a=scan.nextInt(),b=0,c=0,x=0;a>0;)
		{
			b=a%10;
			a=a/10;
			c=c+b;
			x++;
			
			
		}
		
		System.out.println(c);
		System.out.println(x);
		// TODO Auto-generated method stub

	}

}
