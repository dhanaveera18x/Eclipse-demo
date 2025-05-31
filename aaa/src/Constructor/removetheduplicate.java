package Constructor;

public class removetheduplicate {

	public static void main(String[] args) {
		String a="hi i am i am hello";
		String b="";
		String c[]=a.split(" ");
		for(int i=0;i<c.length;i++)
		{
			if(!b.contains(c[i]))
			{
				b=b+c[i]+"";
			}
		}
		
		System.out.println(b);
		// TODO Auto-generated method stub

	}

}
