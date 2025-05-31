package veera;
import java.util.Scanner;

public class Floatnum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num1");
		double a1=scan.nextDouble();
		System.out.println("enter the num2");
		double a2=scan.nextDouble();
		a1=Math.round(a1*1000);
		a1=a1/1000;
		a2=Math.round(a2*1000);
		a2=a2/1000;
		if(a1==a2)
			System.out.println("same");
		else
			System.out.println("different");
		
		
		// TODO Auto-generated method stub

	}

}
