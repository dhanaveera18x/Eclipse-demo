package Strings;
import java.util.Scanner;
public class removevowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String b="";
		char [] c =a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(!"aeiou".contains(c[i]+""))
			{
				b+=c[i];
			}
		}
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
