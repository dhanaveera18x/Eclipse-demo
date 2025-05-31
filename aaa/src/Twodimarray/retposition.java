package Twodimarray;

import java.util.Scanner;

public class retposition {
	public static void main(String args[]) {
	
	Scanner scan=new Scanner(System.in);
	int row =scan.nextInt();
	int col =scan.nextInt();
	int a[][]=new int[row][col];
	int h=scan.nextInt();
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			 a[i][j]=scan.nextInt();
		}
	}

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			 if(a[i][j]==h)
			 {
				 System.out.println(i+","+j);
			 }
			
		}
	}

	
}}
