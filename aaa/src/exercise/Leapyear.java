package exercise;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year:");
		int a=scan.nextInt();
		switch(a)
		{
			case 1:
			{
				if((a%100!=0 &&  a%400==0) || a%4==0)
					System.out.println("it is a leap year");
				    break;
				
				 
			}
			default:
				   System.out.println("it is not a leap year");
				 
		}
		// TODO Auto-generated method stub

	}

}

