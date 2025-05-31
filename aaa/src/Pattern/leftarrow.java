package Pattern;
import java.util.Scanner;

public class leftarrow {

	public static void main(String[] args) {
		int i,j,n,l;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n value:");
		n=scan.nextInt();
		for(i=-n+1;i<=n-1;i++)
		{
			if(i<0)
				l=-i;
			else 
				l=i;
			for(j=0;j<l+1;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}
	scan.close();

	}

}
