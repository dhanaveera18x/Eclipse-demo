package Twodimarray;
import java.util.Scanner;


public class moti3 {
	
	
	public static void factors(int a)
	{
		
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			System.out.println(i);
		}
		
	}
	public static void factorial(int mul,int a)
	{
		
		
		for(int i=a;i>0;i--)
		{
			mul=mul*i;
			
		}
		System.out.println(mul);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		int mul=1;
		System.out.println("factors");
		factors(a);
		System.out.println("factorial");
		factorial(mul,a);
		
		

	}

}
