package exercise;

import java.util.Scanner;

public class Triangleangle {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("a=");
		a=scan.nextInt();
		System.out.println("b=");
		b=scan.nextInt();
		System.out.println("c=");
		c=scan.nextInt();
		if(a+b+c==180 && a>0&&b>0&&c>0) {
			if(a==90||b==90||c==90) {
				
				 
				System.out.println("right triangle");
			}
		
		  
		 
			else if(a>90||c>90||b>90) {
			System.out.println("obtuse  triangle");
		 }
			else if(a<90&&b<90&&a<90) {
			
		 
			System.out.println("equilateral triangle");
		}
		}
		else {
			System.out.println("invalid");
		}
		scan.close();
		
			
			
			
		       
		// TODO Auto-generated method stub

	


		// TODO Auto-generated method stub

	}

}
