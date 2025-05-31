package Loop;
import java.util.Scanner;

public class SumofFactorial {

	public static void main(String[] args) {
		int st,end,s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		for(st=1,end=scan.nextInt(),s=1;st<=end;st++) {
			
			if(end%st==0) {
			
			s=s*st;
		// TODO Auto-generated method stub

	}
			System.out.println(s);
}
	}
}
