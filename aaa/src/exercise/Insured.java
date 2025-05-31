package exercise;

import java.util.Scanner;

public class Insured {

	public static void main(String[] args) {
		char status;
		char sex;
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the status:");
		status=scan.next().charAt(0);
		System.out.println("enter sex:");
		sex=scan.next().charAt(0);
		System.out.println("enter age:");
		age=scan.nextInt();
		if(status=='M')
			System.out.println("insured:");
		else if(sex=='m'&& age>=30)
			System.out.println("insured:");
		else if(sex=='f'&&age>=25)
			System.out.println("insured:");
		else
			System.out.println("not insured:");
		scan.close();
			
			
		
		// TODO Auto-generated method stub

	}

}
