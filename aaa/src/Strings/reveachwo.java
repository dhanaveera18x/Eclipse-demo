
package Strings;



class oo{
	String  moo(String a) {
		String b[]=a.split(" ");
		String c="";
		
		for(int i=b.length-1;i>=0;i--)
		{
			
			String z=b[i];
			String d="";
			for(int j=z.length()-1;j>=0;j--)
			{
				  d+=z.charAt(j);
			}
			c+=d+"  ";
			
		}
		
		return c;
	}
}
public class reveachwo {

	public static void main(String[] args) {
		String a="hari is good";
		oo y=new oo();
		 String d=y.moo(a);
		 System.out.println(d+"");
		// TODO Auto-generated method stub

	}

}
