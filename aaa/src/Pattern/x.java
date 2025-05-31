


package Pattern;
import java.util.Scanner;

public class x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter n value");
		int i,j,n,s,l;
		 n=scan.nextInt();
		for(i=-n;i<n;i++)
		{
			if(i<0)
				l=-i;
			else 
				l=i;
		
		
		for(s=0;s<n-l;s++)
		{
			System.out.print(" ");
		}
		for(j=0;j<l+1;j++)
		{
			System.out.print("* ");
		}
		
	
			System.out.println(" ");
		

	}
	}}


