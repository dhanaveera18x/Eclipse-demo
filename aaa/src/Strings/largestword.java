package Strings;
import java.util.Scanner;
public class largestword {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String b=scan.nextLine();
		String c[]=b.split(" ");
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c[i].length();j++)
			{
				count++;
			}
			sum=count;
			
			System.out.println(c[i]+count);
		}
		// TODO Auto-generated method stub

	}

}
