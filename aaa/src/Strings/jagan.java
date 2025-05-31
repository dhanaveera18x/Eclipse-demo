package Strings;

public class jagan {
	public static void main(String args[]) {
		String a=" the hari good";
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length();j++)
			{
				b[0]=b[0].toUpperCase();
				System.out.println(b[j]);
			}
		}
	}

}
