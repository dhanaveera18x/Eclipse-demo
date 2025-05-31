package exercise;
import java.util.Scanner;

public class Grosssalary {

	public static void main(String[] args) {
		int salary,hra,da;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the salary:");
		salary=scan.nextInt();
		if(salary<=10000) {
			hra=20*salary/100;
			da=80*salary/100;
		}
		else if(salary<=20000) {
			hra=25*salary/100;
		    da=90*salary/100;
		}
			
		else  {
			hra=30*salary/100;
	        da=95*salary/100;
		}
		
			
			
			System.out.println("gross salary"+(salary+hra+da));
			
		}
}
		// TODO Auto-generated method stub

	


