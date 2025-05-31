package Strings;

public class reverseoo {

	public static void main(String[] args) {
		String a="hari is good";
		String []b=a.split(" ");
		String m="";
		for(int i=0;i<b.length;i++)
		{
			String c=" ";
			String z=b[i];
			for(int j=z.length()-1;j>=0;j--)
			{
				c+=z.charAt(j);
				
			}
			m+=c+" ";
		}
		System.out.println(m);
		// TODO Auto-generated method stub

	}

}
