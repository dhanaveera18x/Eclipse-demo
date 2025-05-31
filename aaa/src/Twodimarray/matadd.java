package Twodimarray;
import java.util.Scanner;

public class matadd {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int c[][] =new int[3][3];
		int i,j;
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
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		System.out.println("addition of arrays");
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println(" ");
		}
	
		
	}

}

