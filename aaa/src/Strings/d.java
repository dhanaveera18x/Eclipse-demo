package Strings;

public class d {

	public static void main(String[] args) {
		String a="hariisworking";
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if("aeiou".contains(b[i]+""))
			{
				a.remove(i);
				
				
			}
		
		
		}
		// TODO Auto-generated method stub

	}

}
