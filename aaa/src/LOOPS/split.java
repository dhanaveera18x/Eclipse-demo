package LOOPS;
import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("first number:");
		int a,b;
		for(a=scan.nextInt(),b=0;a>0;)
		{
			b=a%10;
			a=a/10;
			
			
		
			System.out.println(b);
		}
				
		// TODO Auto-generated method stub

	}

}
