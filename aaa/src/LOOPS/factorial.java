package LOOPS;
import java .util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num:");
		int i,j;
		for( i=scan.nextInt(),j=1;i>0;i--)
		
		{
			j=j*i;
		}
		
		System.out.println(j);
		// TODO Auto-generated method stub

	}

}
