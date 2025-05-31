package veera1;

import java.util.Scanner;

public class Upper_lower {

	public static void main(String[] args) {
		
		char a;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character:");
		a=scan.next().charAt(0);
		if('a'<=a&&a<='z')
			System.out.println("lowercase");
		else if('A'<=a&&a<='Z')
		    System.out.println("UPPERCASE");
		else if('0'<=a&&a<='9')
			System.out.println("number");
		
		scan.close();
		// TODO Auto-generated method stub

	}

}
