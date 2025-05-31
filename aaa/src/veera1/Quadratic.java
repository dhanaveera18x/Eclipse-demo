package veera;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		int a,b,c,x;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value:");
		a=scan.nextInt();
		System.out.println("enter the b value:");
		b=scan.nextInt();
		System.out.println("enter the c value:");
		c=scan.nextInt();
		System.out.println("enter the x value:");
		x=scan.nextInt();
		
		System.out.println(" value:"+(a*x*x+b*x+c));
		scan.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
