package V18;
import java.util.Scanner;



public class reverse {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int a,b,d;
		System.out.println("enter the number");
		for(a=scan.nextInt(),b=0,d=0;a>0;)
		{
			b=a%10;
			a=a/10;
			d=d*10+b;
			
			
		}

		System.out.println(d);
	}

}
