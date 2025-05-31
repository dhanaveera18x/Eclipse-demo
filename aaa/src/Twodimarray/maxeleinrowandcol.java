package Twodimarray;
import java.util.Scanner;
public class maxeleinrowandcol {

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
			int max=0;
		
			for( j=0;j<a[i].length;j++){
			if(max<a[i][j])
			{
				max=a[i][j];
			}
				}
			System.out.println("row "+i+"="+max);
		}
		
		for(j=0;j<a.length;j++)
		{
			int max2=0;
		
			for( i=0;i<a[j].length;i++)
			{
				 
			if(max2<a[i][j])
			{
				max2=a[i][j];
			}
		// TODO Auto-generated method stub

	         }
			System.out.println("col "+j+"="+max2);
		}
}}
