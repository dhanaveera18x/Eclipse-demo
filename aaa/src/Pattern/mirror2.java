package Pattern;
import java.util.Scanner;

public class mirror2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i,n,j,s,l;
		n=scan.nextInt();
		for(i=-n;i<=n;i++)
		{
			if(i<0)
				l=-i;
			else
				l=i;
			
			
				for(j=0;j<n+1;j++)
				{
					if(j<n-l)
					System.out.print(" ");
					else
						System.out.print("* ");
				}
				System.out.println(" ");
			}
		
			
					
					
			}
		// TODO Auto-generated method stub

	}


