package my;

public class findcommonelement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,5,2,3,4,9};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
					{
				
					}
		}
		int b[]= {5,6,7,8,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
