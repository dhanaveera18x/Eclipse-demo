package exercise;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		double qty,price,total;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the qty:");
		qty=scan.nextDouble();
		System.out.println("enter the price:");
		price=scan.nextDouble();
		total=qty*price;
		
		if(qty>=100)
			System.out.println("amount"+(total=total-(total*0.1)));
		else
			System.out.println("amount"+total);

	}

}
