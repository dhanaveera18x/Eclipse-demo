package Work;

public class largestcontiniouspair {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int big=0;
		for(int i=0;i<a.length-1;i++)
		{
			sum=a[i]+a[i+1];
			if(big<sum)
			{
				big=sum;
			}
		}
		System.out.println(big);
		

	}

}
