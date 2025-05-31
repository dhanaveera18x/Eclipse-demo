package Work;
import java.util.Scanner;

public class exp3 {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("enter the size of the arrray");
		int n= scan.nextInt();
		System.out.println("enter the size of the arrray");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=scan.nextInt();
			
		}
		int big=0;
		for(int i=0,j=1;j<a.length;i++,j++)
		{
			int sum=a[i]+a[j];
			if(sum>big)
			{
				big=sum;
			}
		}
		
		System.out.println(big);
		

	}

}
