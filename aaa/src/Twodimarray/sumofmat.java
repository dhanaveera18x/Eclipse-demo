package Twodimarray;
import java.util.Scanner;


public class sumofmat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		int i=0;
		int j=0;
		int sum=0;
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				 a[i][j]=scan.nextInt();
			}
		}

		for( i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				 sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
