package veera;

import java.util.Scanner;

public class Elecricitybill2 {

	public static void main(String[] args) {
		double a;
		double total=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the electricity unit");
		a=scan.nextDouble();
		if(a<=50) {
			total=a*0.50;
		   }
		else if(a<=150) {
			total=(50*0.5)+((a-50)*0.75);
		}
		else if(a<=250) {
			total=(50*0.5)+(150*0.75)+((a-200)*1.20);
		}
		else if(a<250) {
			total=(50*0.5)+(150*0.75)+(250*1.20)+((a-450)*1.50);
		}
		else {
			System.out.println("invalid");
		}
		System.out.println("electricioty bill:"+(total+(a*0.2))+"/unit");
		scan.close();
			
		
	}
}
		
			