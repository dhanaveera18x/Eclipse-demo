package veera;
import java.util.Scanner;

public class Positivenegativenum {

	public static void main(String[] args) {
		double a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num a");
		a= scan.nextDouble();
		
		if(a>0 && a<=1)
			System.out.println("smallest positive number");
		else if(a>1)
		    System.out.println("positive number");
		else if(0<a&&a<=-1)
			System.out.println("larges negative number");
		
		else  
		    System.out.println("negative number");
		  scan.close();
		
		
		// TODO Auto-generated method stub

	}

}
