package my;
import java.util.Scanner;

public class sumofarray {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	int a[]=new int [num];
	int s=0;
	for(int i=0;i<num;i++)
	{
		a[i]=scan.nextInt();
		
	}
	for(int i=0;i<num ;i++)
	{
		s=s+a[i];
	}
	System.out.println(s);
	scan.close();
}
}
