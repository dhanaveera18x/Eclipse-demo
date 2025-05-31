package One;

public class a {

	public static void main(String[] args) {
		String a="madam";
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		String b=new String(sb);
		if(a.equals(b))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
		
		// TODO Auto-generated method stub

	}

}
