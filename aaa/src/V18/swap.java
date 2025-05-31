package V18;
import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first numer");
		a=scan.nextInt();
		System.out.println("enter the second numer");
		b=scan.nextInt();
		
		//c=a;
		//a=b;
		//b=c;
		//a=a+b;
		//b=a-b;
		//a=a-b;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
