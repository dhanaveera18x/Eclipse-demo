package Twodimarray;
import java.util.ArrayList;
import java.util.Scanner;

public class snake {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> y=new ArrayList<Integer>();
		int a[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
			if(i%2==0) {
			for(int j=0;j<a[i].length;j++)
			{
				y.add(a[i][j]);
					
				}}
			else
			{
				for(int j=a[i].length-1;j>=0;j--)
				{
					y.add(a[i][j]);
						
					}
				
					
					
				}
				
				
			}
		System.out.println(y);
		}

}
