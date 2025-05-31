package LOOPS;
import java.util.Scanner;

public class Table {
	public void main (String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a,i,c;
		for(i=0,a=scan.nextInt();i<=10;i++)
		{
			c=a*i;
			System.out.println(i+"*"+a+"="+c);
		
		}
		scan.close();
	}
	

}
