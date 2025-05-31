package V18;
import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int i,j,x;
		System.out.println("enter the number");
		
		for(i=1, j=scan.nextInt(),x=0;i<=j;i++)
		{
			if(j%i==0)
			{
				x++;
			}
				
			
		}
		if(x==2)
		{
			System.out.println("prime");
			
		}
		else
		{
			System.out.println("not prime");
		}
		// TODO Auto-generated method stub

	}

}
