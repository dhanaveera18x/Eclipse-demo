package Strings;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
	String a="aeiijiuouxgh@123",d="",e="";
	int b=0;
	char []z=a.toCharArray();
	for(int i=0;i<z.length;i++)
	{
	  if("aeiou".contains(z[i]+""))
	  {
		d=d+z[i];
		 
	  }
	}
	System.out.print(d);
	System.out.println(" ");
	System.out.println(" after duplicate removed");
	char []c=d.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(!e.contains(c[i]+""))
		{
			e=e+c[i];
		}
	}
	System.out.print(e);
	 

	}

}
