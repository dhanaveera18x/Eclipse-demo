package Loop;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		
		System.out.println("enter b");
		
		for(i=scan.nextInt(),j=scan.nextInt();i>=j;i--) {
			if(i%2==0) {
			System.out.println(i);
			}
		}

	}

}
