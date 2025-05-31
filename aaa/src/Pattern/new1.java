package Pattern;
import java.util.Scanner;

public class new1 {
	public static void main(String args[]) {
		int i,j,n,s;
		Scanner scan=new Scanner(System.in);
		
		n=scan.nextInt();
		
		for ( i=0;i<n;i++)
		{
			for(s=0;s<n-i-1;s++)
			{
				System.out.print(" ");
			
			}
			for(j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println("  ");
		}
		
		
	}
	

}
