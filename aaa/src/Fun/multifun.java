package Fun;
import java.util.Scanner;

public class multifun {
	public static void factor(int a) {
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}}
		 static void factorial(int a,int mul)
		{
			
			for(int i=a;i>0;i--)
			{
				mul=mul*i;
				
			}
			System.out.println(mul);
			
		
		
		
	}
		public static void prime(int a,int sum)
		{
			
			for(int i=0;i<a;i++)
			{
				if(i%2==0)
				{
					sum++;
				}
				
			}
			if(sum<3)
			{
				System.out.println(" it is prime number");
			}
			else
			{
				System.out.println(" it is not prime number");
			}
			
		
		
		
	}
		public static void perfect(int a,int sum) {
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					sum=sum+i;
				}
				
			}
			System.out.println(sum);
			}
		 static void strong (int a,int mul)
			{
				
				for(int i=a;i>0;i--)
				{
					mul=mul*i;
					
					
				}
				System.out.println(mul);
				
			
			
			
		}

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number a=");
		int a=scan.nextInt();
		int mul=1;
		int sum=0;
		int s=0;
		System.out.println("the factor of the number is");
		factor( a);
		System.out.println("the factorial of the number is");
		factorial(a,mul);
		System.out.println("the prime of the number is");
		prime(a,sum);
		System.out.println("the perfect of the number is");
		perfect(a,sum);
		
		

	}

}
