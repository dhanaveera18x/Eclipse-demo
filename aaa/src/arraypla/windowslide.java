package arraypla;

public class windowslide {
	public static int   ansz(int a[],int k)
	{
		int wsum=0;
		int csum=0;
		
		for(int i=0;i<k;i++)
		{
			wsum=wsum+a[i];
		}
		for(int i=k;i<a.length;i++)
		{
			wsum=wsum-a[i-k]+a[i];
			csum=Math.max(csum,wsum);
		}
		return csum;
	}

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int k=3;
		int y=ansz(a,k);
		System.out.println(y);
		// TODO Auto-generated method stub

	}

}
