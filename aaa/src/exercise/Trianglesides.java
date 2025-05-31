package exercise;

import java.util.Scanner;

public class Trianglesides {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("a=");
		a=scan.nextInt();
		System.out.println("b=");
		b=scan.nextInt();
		System.out.println("c=");
		c=scan.nextInt();
		if(a+b>c&&a+c>b&&b+c>a) {
		
		  if(a==b&&b==c) {
			System.out.println("equilateral triangle");
		 }
		 
		  else if(a==c||c==b||b==a) {
			System.out.println("isoleces  triangle");
		 }
		  else if(a!=b&&b!=c&&a!=c) {
			
		 
			System.out.println("scalene triangle");
		}
		}
		else {
			System.out.println("invalid");
		}
		scan.close();
		
			
			
			
		       
		// TODO Auto-generated method stub

	}
}


