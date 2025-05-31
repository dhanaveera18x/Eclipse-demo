package Twodimarray;
import java.util.Scanner;
public class transpose {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[][]=new int [3][3];
		int c[][]=new int [3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[j][i];
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println(" ");
		}

	}

}
