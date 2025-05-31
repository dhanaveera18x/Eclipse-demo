package arraypla;

public class repeatedstr {
	public static  int ans(String a,int b)
	{
		int count=0;
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)=='a')
			{
				count++;
			}
			
		}
		count =count*(b/a.length());
		for(int i=0;i<(b%a.length());i++)
		{
			if(a.charAt(i)=='a')
			{
				count++;
			}
		}
		//i%a.length()
		return count;
		
	}

	public static void main(String[] args) {
		String a="abab";
		int b=10;
		int y=ans(a,b);
		System.out.println(y);
		// TODO Auto-generated method stub

	}

}
