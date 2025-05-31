package my;
import java.util.Scanner;

public class duplicateelemrnt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]==a[i])
			{
				System.out.println(a[i]+"is repeated");
			}
		}
	}

}
