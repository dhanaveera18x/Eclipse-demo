package exercise;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the entry year:");
		a=scan.nextInt();
		System.out.println("enter the current year:");
		b=scan.nextInt();
		if(b-a>3)
			System.out.println("bonous"+2500);
			else
				System.out.println("nothing");
				
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
