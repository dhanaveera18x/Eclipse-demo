package Twodimarray;
import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" a value");
		int a=scan.nextInt();
		
		System.out.println("b value");
		int b=scan.nextInt();
		System.out.println("c value");
		int c=scan.nextInt();
		int j=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0&&c%i==0)
			{
				j=i;
			}
		}
		
		System.out.println(j);
				
		// TODO Auto-generated method stub

	}

}
