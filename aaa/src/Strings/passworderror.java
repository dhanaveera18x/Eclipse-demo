package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class passworderror {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char []g = new char[3];
		String a =scan.nextLine();//esscFD 75
		char [] b=a.toCharArray();
		int count=0;
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length();i++)
		{
			if(Character.isDigit(b[i])||Character.isLowerCase(b[i])||Character.isUpperCase(b[i])||("").contains(b[i]+" "))
			{
				
			}
			else
			{
				count++;
				
				}
				
			}
		
		System.out.println(count);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
