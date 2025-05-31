package Twodimarray;
import java.util.Scanner;

public class addrow {


	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for( int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for( int j=0;j<a.length;j++)
			{
				b[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[i][j]+b[i][j];
			}
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
