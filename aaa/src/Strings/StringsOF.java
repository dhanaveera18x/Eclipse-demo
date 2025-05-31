package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringsOF {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Enter the string");
		String a = sc.nextLine();
		
		char []b = a.toCharArray();
		
		for(int i=0;i<b.length;i++) {
			if(Character.isDigit(b[i])) {
				int d= Integer.parseInt(String.valueOf(b[i]));
				c+=d;
			}
		}
		System.out.println(c);
		sc.close();
		
		
	}

}
