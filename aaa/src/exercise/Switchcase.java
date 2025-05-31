package exercise;
import java.util.Scanner;

public class Switchcase{
	public static void main (String[] args) {
	int a;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number:");
	a=scan.nextInt();
	switch(a%2)
	{
		case 0:
		      System.out.println("even");
		      break;
		default: 
			  System.out.println("odd");
			
		
	}
	
	}
	

}