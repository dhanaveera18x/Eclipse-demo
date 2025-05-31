package Array;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		int a[]=new int [5];
		for(i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

		
		

	}

}
