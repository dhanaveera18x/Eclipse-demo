package Loop;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c,i;
		System.out.println("enter the base");
		a=scan.nextInt();
		System.out.println("enter the base");
		b=scan.nextInt();
		for( i=1,c=1;i<=b;i++ )
		{
			c=a*c;
		}
		System.out.println(c);
		
		
		
		// TODO Auto-generated method stub

	}

}
