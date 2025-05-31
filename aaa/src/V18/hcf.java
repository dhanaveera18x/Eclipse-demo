
package V18;
import java.util.Scanner;


public class hcf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int i,j;
		for(i=1,j=0;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
			{
				j=i;
			}
			
			
		}
		System.out.println(j);
	}
	
}
		