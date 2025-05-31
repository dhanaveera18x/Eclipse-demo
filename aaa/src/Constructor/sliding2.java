package Constructor;

public class sliding2 {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int n=3;
		int sum=0;
		int wmax=0;
		for(int i=0;i<n;i++)
		{
			wmax=wmax+a[i];
		}
		sum=wmax;
		
		for(int i=n;i<a.length;i++)
		{
			sum=sum-a[i-n]+a[i];
			wmax=Math.max(wmax, sum);
		}
		System.out.println( wmax);
		// TODO Auto-generated method stub

	}

}
