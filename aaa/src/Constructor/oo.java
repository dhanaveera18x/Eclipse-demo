package Constructor;

public class oo {

	public static void main(String[] args) {
		String a ="khh jh kjk jh bj";
		int n=4;
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{	
			System.out.print(b[i]);
		}
		System.out.print(" ");
		int wmax=0;
		for(int i=0;i<b.length-n;i++)
		{
			int max=0;
			for(int j=0;j<n;j++)
			{
				max+=b[i+j].length();
			}
			if(wmax<max)
			{
				wmax=max;
			}
		}
		System.out.println(wmax);
		// TODO Auto-generated method stub

	}

}
