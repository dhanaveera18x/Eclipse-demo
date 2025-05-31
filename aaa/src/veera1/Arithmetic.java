package veera;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		char first_num;
		char second_num;
		char symbol;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number:");
		first_num=scan.next().charAt(0);
		System.out.println("enter the symbol:");
		second_num=scan.next().charAt(0);
		System.out.println("enter the  second number:");
		symbol=scan.next().charAt(0);
		if((first_num=='+' && second_num=='+'&& symbol=='*')||(first_num=='-' && second_num=='-'&& symbol=='*'))
			System.out.println("+");
			else if	((first_num=='-' && second_num=='+'&& symbol=='*')||(first_num=='+' && second_num=='-' && symbol=='*'))
				System.out.println("-");
			else
				System.out.println("invalid");
			scan.close();
				
		// TODO Auto-generated method stub

	}

}
