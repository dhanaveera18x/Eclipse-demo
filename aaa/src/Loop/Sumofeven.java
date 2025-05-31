package Loop;
import java.util.Scanner;

public class Sumofeven {

	public static void main(String[] args) {
		int a,b,s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		
		for(a=1,b=scan.nextInt(),s=0;a<=b;a++) {
			if(a%2==0)
		    s=s+a;
		}
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
