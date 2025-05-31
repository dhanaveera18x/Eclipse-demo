package Strings;
import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the password");
		String a=scan.nextLine();
		int up=0,lo=0,num=0,sym=0;
		for(char z:a.toCharArray()) {
		  if(Character.isLowerCase(z))
		  {
			  up++;
		  }
		  else  if(Character.isUpperCase(z))
		  {
			  lo++;
		  }
		  else if(Character.isDigit(z))
		  {
			  num++;
		  }
		  
		 
		  else
		  {
			  sym++;
		  }
		
	}
		if(up>=1&&lo>=1&&num>=1&&sym>=1)
			System.out.println("your password is valid");
		

		if(up<1)
		  System.out.println("your password must contain one uppercase");
		if(lo<1)
		  System.out.println("your password must contain one lowercase");
		if(num<1)
		  System.out.println("your password must contain one numbercase");
		if(sym==0)
		  System.out.println("your password must contain one symbolcase");
		if(a.length()<8)
			System.out.println("your password must contain 8 letter");
			
		
		

	}
}

	
