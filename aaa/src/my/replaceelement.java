package my;
import java.util.Scanner;

public class replaceelement {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("index:");
		int b=scan.nextInt();
		System.out.println("value:");
		int c=scan.nextInt();
		int i;
		
		for( i=0;i<a.length;i++)
		{
			if(b==i)
			{
				a[i]=c;
			}
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
