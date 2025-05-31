package exercise;

import java.util.Scanner;


public class factors{
public static void main(String args[]) {
	int a,b,c;
  Scanner scan= new Scanner (System.in);
  System.out.println("enter the number");
  for(a=scan.nextInt(),b=0,c=0;a>0;)
  {
	  b=a%10;
	  a=a/10;
	  c=c+b;
	  System.out.println("factor is="+a);
	 
  }
 

		// TODO Auto-generated method stub

	}

}
