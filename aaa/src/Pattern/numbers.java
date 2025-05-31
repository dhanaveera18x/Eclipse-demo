package Pattern;
import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value:");
		int i,j,n,k;
		
		 n=scan.nextInt();
		for(i=0,k=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print((char) ('A'+k)+ " ");
				k++;
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
