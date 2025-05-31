package Onestrings;

public class frequencyofcharacter {

	public static void main(String[] args) {
		String a="hariharan";
		String c="";
		char d[]=a.toCharArray();
		for(int i=0;i<d.length;i++)
		{
			if(!(c.contains(d[i]+"")))
			{
				c=c+d[i];
			}
			
		}
		System.out.println(c);
		char e[]=c.toCharArray();
		for(int i=0;i<e.length;i++)
		{
			System.out.print(e[i]+" ");
		}
		
		char b[]=a.toCharArray();
		
		for(int i=0;i<e.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
			if(e[i]==b[j]) 
			{
				count++;
				
			}
			
			}
			System.out.print(e[i]+""+count);
			
		}
	
	}}




