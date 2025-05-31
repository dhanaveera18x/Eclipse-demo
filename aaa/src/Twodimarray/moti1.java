package Twodimarray;
import java.util.Scanner;
public class moti1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		int count=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println("not prime number");
		}
		
	

	}

}
