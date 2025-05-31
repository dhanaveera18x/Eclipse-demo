package my;
import java.util.Scanner;

public class Exampl {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
	    int i,b=scan.nextInt();
		int a[]= {1,2,3,4,5,6};
		for(i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.println(i);
			}
				
		}
	System.out.println(a[0]);
		

	}

}

