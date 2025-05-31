package LOOPS;
import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i,j,a,b;
		for(i=scan.nextInt(),j=scan.nextInt(),a=1,b=1;a<=j;a++)
		{
			b=b*a;
		}
	System.out.println(b);

	}

}
