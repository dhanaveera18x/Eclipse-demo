package LOOPS;
import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a ,b,x;
		for(a=scan.nextInt(),b=1,x=0;b<=a;b++)
		{
			if(a%b==0)
			{
				x++;
			}
			
		}
	if(x==2)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println(" not prime");
	}
	}
}