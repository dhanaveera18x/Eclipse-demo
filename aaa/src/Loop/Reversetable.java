package Loop;

import java.util.Scanner;

public class Reversetable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    int a=10;
	    int b=1;
	    System.out.println("table");
	    int t=scan.nextInt();
	    for(;a>=b;a--) {
	    	System.out.println(a+"*"+t+"="+(a*t));
	    }
	    scan.close();
		// TODO Auto-generated method stub

	}

}
