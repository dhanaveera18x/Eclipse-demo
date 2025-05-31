package Work;

public class mergetwoarraysandsort {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,1,2,4};
		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[j];
				j++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		

	}

}
