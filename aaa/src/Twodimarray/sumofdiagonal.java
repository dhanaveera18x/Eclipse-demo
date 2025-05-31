
package Twodimarray;

import java.util.Scanner;

public class sumofdiagonal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int i=0;
		int j=0;
		int main=0;
		int side=0;
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				 a[i][j]=scan.nextInt();
			}
		}

		for( i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					main=main+a[i][j];
				}
				
				if(i+j==a.length-1)
				{
					side=side+a[i][j];
				}
				
			}
		}
		System.out.println("main="+main);
		System.out.println("side="+side);

}}
