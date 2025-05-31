package Onestrings;
import java.util.Scanner;
public class twostringsareanagram {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the strings");
		String a=scan.next();
		System.out.println("enter the strings");
		String b=scan.next();
		
		char temp1=0;
		char temp2=0;
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
		
		
		for(int  i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				
			if(c[i]>c[j])
			{
			temp1=c[i];
			c[i]=c[j];
			c[j]=temp1;
			}
			if(d[i]>d[j])
					{
				temp2=d[i];
			    d[i]=d[j];
				d[j]=temp2;
					}
			
		}
			
	} int count=0;
		for(int i=0;i<c.length;i++)
		{
		if(c[i]==d[i])
		{
			count++;
			
		}}
		if(count==c.length)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");	
		}

	
	}
}
