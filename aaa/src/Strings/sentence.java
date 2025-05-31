package Strings;

public class sentence {

	public static void main(String[] args) {
		String a="this is hariharan working in niit";
		StringBuilder sr= new StringBuilder(a);
		{
			sr.delete(0,4);
			sr.delete(22 ,a.length());
		}
		String b= new String(sr);
		
      System.out.println(b);
	}

}
