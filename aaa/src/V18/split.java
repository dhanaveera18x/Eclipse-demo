package V18;
import java.util.Scanner;



public class split {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int a,b,sum=0;
		System.out.println("enter the number");
		for(a=scan.nextInt(),b=0;a>0;)
		{
			b=a%10;
			a=a/10;
			
			System.out.println(b);
			sum=sum+b;
		}
System.out.println(sum);


	}

}
