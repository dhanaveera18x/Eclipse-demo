package LOOPS;
import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		int a=0,b=1,i,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the n number");
		int n =scan.nextInt();
		System.out.print('0');
		for(i=1;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c);
		   
		}
		// TODO Auto-generated method stub

	}

}
