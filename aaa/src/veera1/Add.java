package veera;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year:");
		a=scan.nextInt();
		if(a%100==0)
		{
			if(a%400==0)
			{
				System.out.println("it is a leap year");
			
			}
			else
			{
				System.out.println("it is not a leap year");
			}
		}
		else if(a%4==0)
		{
			System.out.println("it is leap year");
		}
		else
			{
			
			System.out.println("it is not a leap year");
			}
		scan.close();

	}

}
