package Constructor;

public class sliding {

	public static void main(String[] args) {
		int a[]= {1,2,5,4,3,3,-9,-8,4,5};
		int n=3;
		int wsum=0;
		for(int i=0;i<=a.length-n;i++)
		{
			int sum=0;
			for(int j=i;j<i+n;j++)
			{
				sum=sum+a[j];
			}
			if(wsum<sum)
			{
				wsum=sum;
			}
		}
			System.out.println(wsum);
		// TODO Auto-generated method stub

	}

}
