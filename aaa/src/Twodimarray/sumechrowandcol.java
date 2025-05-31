package Twodimarray;
import java.util.Scanner;
public class sumechrowandcol {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		int a[][]=new int[2][2];
		int i=0;
		int j=0;
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				 a[i][j]=scan.nextInt();
			}
		}

		for(i=0;i<a.length;i++)
		{
			int row=0;
		
			for( j=0;j<a[i].length;j++)
			{
				 
				 row+=a[i][j];
		// TODO Auto-generated method stub

	         }
			System.out.println("row "+i+"="+row);
		}
		
		for(j=0;j<a.length;j++)
		{
			int col=0;
		
			for( i=0;i<a[j].length;i++)
			{
				 
				 col+=a[i][j];
		// TODO Auto-generated method stub

	         }
			System.out.println("col "+j+"="+col);
		}
}}
