package Twodimarray;

import java.util.Scanner;

class mato{
	public void hel (int a[][]) {
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
						
			}
		}
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=temp;
				
			}}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
				
			}
			System.out.println(" ");
		}
		
			
		
		
	}
	}

public class degree270 {

	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int a[][]=new int[3][3];
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					 a[i][j]=scan.nextInt();
				}
			}
			mato y=new mato();
			y.hel( a);
			
			
			// TODO Auto-generated method stub

		}

	}

		// TODO Auto-generated method stub

	