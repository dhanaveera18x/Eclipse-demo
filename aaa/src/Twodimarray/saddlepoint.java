package Twodimarray;

import java.util.Scanner;

public class saddlepoint {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a[][]=new int[2][2];
		int i=0;
		int j=0;
		for( i=0;i<a.length;i++)
		{
			for( j=1;j<a.length;j++)
			{
				 a[i][j]=scan.nextInt();
			}
		}
		for( i=0;i<a.length;i++)
		{
			int minv=a[i][0];
			int minc=0;
					for(j=1;j<a[i].length;j++)
					{
						if(a[i][j]<minv)
						{
							minv=a[i][j];
							minc=j;
						}
					}
	
		
						int mincv=a[0][minc];
						for(int r=0;r<a.length;r++)
						{
							
						if(a[r][minc]>mincv)
						{
							mincv=a[i][j];
						}
					
						if(minv==mincv)
						{
							System.out.println(a[i][j]);
							break;
		                 }
		// TODO Auto-generated method stub
		}
		System.out.println(" no saddle point");
		
	}
	}
}
