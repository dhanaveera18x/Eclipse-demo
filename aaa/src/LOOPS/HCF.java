package LOOPS;
import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int i,c;
		
		
		for( i=1,c=0;i<=a;i++)
		{
			if(a%i==0 &&b%i==0)
			{
				c=i;
			}
		}
		System.out.println(c);
	
		// TODO Auto-generated method stub

	}

}
