package exercise;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("a=");
		a=scan.nextInt();
		
		
		if(a>0) {
			if(a<6) {
				System.out.println("small number");
			}
				
			else if(a<10) {
			System.out.println("large number");
		 }
			else if(a<15) {
			System.out.println("largest number");
	     }
		}
		else {
			System.out.println("invalid");
		}
			
		// TODO Auto-generated method stub

	}

}
