package arraypla;

public class maxsub {

	public static int anos(int a[])
	{
	int maxsum=a[0];
	int sum=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(sum>=0)
		{
			sum=sum+a[i];
		}
		else {
			sum=a[i];
		}
		if(sum>maxsum)
		{
			maxsum=sum;
		}
	}
	return maxsum;
			}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		
		 int y=anos(a);
		System.out.println(y);
		// TODO Auto-generated method stub

	}

}
