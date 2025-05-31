package Strings;

public class centervalue {

	public static void main(String[] args) {
		
			String a="hari";
			
			int b,c;
			b=a.length();
			if(b%2==0)
			{
				c=b/2-1;
				System.out.println(a.charAt(c));
			}
			else
			{
				c=b/2;
				System.out.println(a.charAt(c));
			}
			
		// TODO Auto-generated method s
	}

}
