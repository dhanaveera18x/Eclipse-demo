package Regex;
import java.util.Scanner;

import java.util.regex.Pattern;



import java.util.regex.Matcher;
public class dhobi {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		Pattern p1=Pattern.compile("[A-Z]");
		Pattern p2=Pattern.compile("[\\d\\d]");
		Pattern p3=Pattern.compile("[CSE|ECE|EEE]");
		Pattern p4=Pattern.compile("[A-Z]");
		Pattern p5=Pattern.compile("[\\d\\d\\d]");
		String a=sc.nextLine();
		

//		Matcher m=p1.matcher(a);
//		Matcher m=p2.matcher(a);
//		Matcher m=p3.matcher(a);
//		Matcher m=p4.matcher(a);
//		Matcher m=p5.matcher(a);
		if(p1.matcher(a).find() &&p2.matcher(a).find()&&p3.matcher(a).find())
		{
			System.out.println("Success");
			}
		else
		{
			System.out.println("failed");
		}

		
		// TODO Auto-generated method stub

	}

}
