package V18;
import java.util.Scanner;

 public class leapyear{
	
	 
	 public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a%100==0)
		{
			if(a%400==0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("not leap year");
			}
		}
		else
		{
			if(a%4==0)
			{
				System.out.println(" leap year");
				
			}
			else
			{
				System.out.println("not a leap year");
			}
		}
			
		
		
			
		 
	 }
	 
 }