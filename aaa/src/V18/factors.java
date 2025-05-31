package V18;
import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		for(int i=n;i>0;i--) 
		{
			
			if(n%i==0)
			{
			System.out.println(i);
			}
			
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
