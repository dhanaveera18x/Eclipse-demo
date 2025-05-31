package Constructor;

public class Substri {

	public static void main(String[] args) {
		String a="dndcjkc";
		char b[] =a.toCharArray();	
		for(int i=0;i<b.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				for(int k=i;k<j;k++)
				{
					System.out.print(b[k]);
				}
				System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}
