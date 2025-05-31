package Loop;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int st,end;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		for(end=scan.nextInt(),st=1;st<=end;st++) {
			
			if(end%st==0) {
			System.out.println(st);
			}
			
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
