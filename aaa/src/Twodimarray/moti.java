package Twodimarray;
import java.util.Scanner;


public class moti {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year");
		int year =scan.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println("leap year");
			}
			else 
			{
				System.out.println("not a leap year");
			}
		}
		
			else
			{
					if(year%4==0)
					{
						System.out.println("leap year");
						
					}
					else
						
					{
						System.out.println("not a leapyear");
					}
			}
			
			
		}
		
	}


