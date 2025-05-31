package Twodimarray;

import java.util.Scanner;

public class jaggedarray {

	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			
			int a[][]=new int [2][];
			a[0]=new int [2];
			a[1]=new int [3];
			for( int i=0;i<a.length;i++)
			{
				for(int  j=0;j<a.length;j++)
				{
					 a[i][j]=scan.nextInt();
				}
			}
			for( int i=0;i<a.length;i++)
			{
				for(int  j=0;j<a.length;j++)
				{
					System.out.println( a[i][j]);
				}
			}

		// TODO Auto-generated method stub

	}

}
