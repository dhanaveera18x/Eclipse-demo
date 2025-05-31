package Twodimarray;
import java.util.Scanner;

public class matmul {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int c[][] =new int[3][3];
		int i,j,k;
		System.out.println("enter the first array");
		for(i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		System.out.println("enter the second array");
		for( i=0;i<b.length;i++)
		{
			for( j=0;j<b.length;j++)
			{
				b[i][j]=scan.nextInt();
				
			}
		}
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				c[i][j]=0;
				for(k=0;k<a.length;k++)
				
				c[i][j]+=a[i][k]*b[k][j];
				
			
		}
		}
		for(  i=0;i<a.length;i++)
		{
			for(  j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]);
				
			}
			System.out.println(" ");
		}
	
		
	                                                                     

}
}
