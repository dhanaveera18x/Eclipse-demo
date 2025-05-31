package Pattern;

import java.util.Scanner;

public class mirror {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		int i,n,j,s,l;
		n=scan.nextInt();
		for(i=-n;i<=n;i++)
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
		
			
					
					
			}
		}


	


