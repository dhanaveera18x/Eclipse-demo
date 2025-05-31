package veera;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		float a1;
		float a2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number1:");
		a1=scan.nextFloat();
		System.out.println("enter number2:");
		a2=scan.nextFloat();
		if(a1==a2)
			System.out.println("same");
		else
			System.out.println("different");
		scan.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
