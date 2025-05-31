package my;
import java.util.Arrays;
import java.util.Scanner;

public class arraybasic {

public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	
	
	int[]a= {1,2,3,4,5,0};
	
	for( int i=0;i<a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	int b=scan.nextInt();
	int c=scan.nextInt();
	for(int i=a.length-1;i>b;i--)
	{
		if(i==b)
		{
			a[i]=c;
			
		}
		else
		{
		a[i]=a[i-1];
		}
		
		
	}
	System.out.println(Arrays.toString(a));
	
	
}
}