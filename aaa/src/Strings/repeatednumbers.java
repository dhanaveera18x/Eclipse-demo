package Strings;

public class repeatednumbers {

	public static void main(String[] args) {
		String a="machinmae",b=" ";
		   char[] c=a.toCharArray();
		   for(int i=0;i<c.length;i++)
		   {
			   
		   
		   
			   if(!b.contains(c[i]+""))
			   {
				   b=b+c[i];
				     
			   }
			   
			   
		   }
		   System.out.println(b);
		   

	}

}
