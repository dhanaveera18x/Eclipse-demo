package my;

public class MERGETWOSORTEDARRAY {
	public static void main(String args[]) {
		int []a= {1,3,4,5,6};
		int []b= {2,2,6,7,8};
		int []c=new int[a.length+b.length];
		int j=0;
		int i=0;
		for(int p=0;p<c.length;p++)
		{
			if(i<a.length&&(j>b.length||a[i]<=b[j]))
			{
				c[p]=a[i];
				i++;
				
			}
			else
			{
				c[p]=b[j];
				j++;
				
			}
		}
		for(int p=0;p<c.length;p++)
		{
			System.out.println(c[p]);
		}
		
	}

}
