package Work;
import java.util.Scanner;

public class exp2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the array size");
		  int n=scan.nextInt();
		  System.out.println("enter the array value");
		  int a[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  a[i]=scan.nextInt();
		  }
		
		  System.out.println("enter the gap value");
		  
		int sum=0;
		for(int i=0, x=scan.nextInt();i<a.length;i=i+x)
		{
			sum=sum+a[i];
		}
  System.out.println(sum);
	}

}
