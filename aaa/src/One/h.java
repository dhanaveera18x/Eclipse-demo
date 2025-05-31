package One;

public class h {

	public static void main(String[] args) {
		String a="hari123";
		int sum=0;
		char b[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(Character.isDigit(b[i]))
			{
				sum=sum+(b[i]-'0');
			}
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
