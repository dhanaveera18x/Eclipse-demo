package exercise;
import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		double a,b,c,d,r1,r2,r3;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a");
		a=scan.nextDouble();
		System.out.println("enter the b");
		b=scan.nextDouble();
        System.out.println("enter the c");
        c=scan.nextDouble();
        d=(b*b-4*a*c);
        if(d>0){
        	r1=(-b+Math.pow(d,0.5))/2.0*a;
        	r2=(-b-Math.pow(d,0.5))/2.0*a;
        	System.out.println("the root value is "+r1);
        	System.out.println("the root value is "+r2);
        	
        	
        }
        else if (d==0.0) {
        	r3=-b/2.0*a;
        System.out.println("the root value is "+ r3 );
        }
        else   
        {  
        System.out.println("Roots are not real.");  
        }
        scan.close();
        
        	
        	
	}
		

}
