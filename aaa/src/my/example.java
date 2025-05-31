package my;
import java.util.Arrays;
import java.util.Scanner;

public class example {


public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
		
		
		int i;
		
		int  a[]=new int[5];
		
		for( i=0;i<5;i++)
		{
		 
		
		a[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("enter position");
		int b=scan.nextInt();
		
		for(i=b;i<4;i++)
		{
			a[i]=a[i+1];
		}
		a[4]=0;
		
		for(int j=0;j<5;j++)
		{
			System.out.println(a[j]);
		}
	}

}
