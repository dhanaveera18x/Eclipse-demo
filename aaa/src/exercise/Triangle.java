package exercise;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("a=");
		a=scan.nextInt();
		System.out.println("a=");
		b=scan.nextInt();
		System.out.println("a=");
		c=scan.nextInt();
		
		
		if(a+b+c==180 && a>0 &&b>0&&c>0)
			System.out.println("it is a triangle");
		else 
			System.out.println("not a triangle");
		// TODO Auto-generated method stub

	}

}
