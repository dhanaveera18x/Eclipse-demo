package Twodimarray;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int a=0,b=1;
		System.out.print(a+","+b+",");
		int c=0;
		for(int i=2;i<num;i++)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+",");
		}
		

	}

}
