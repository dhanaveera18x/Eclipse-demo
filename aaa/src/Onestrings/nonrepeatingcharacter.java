package Onestrings;

public class nonrepeatingcharacter {

	public static void main(String[] args) {
		String a="hariharan",c="";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(!(b[i]==b[j]))
			{
				c=c+b[j]+"";
				
			}
			}
		}
		System.out.print(c+" ");
		// TODO Auto-generated method stub

	}

}
