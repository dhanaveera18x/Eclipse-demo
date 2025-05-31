package my;

public class neighbourrepeat {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,6,7,7,7,8,9,1,2};
		int b[]=new int[11];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(!(a[i]==a[i+1]))
			{
				b[j]=a[i];
				j++;
			}
		}
		for( int k=0;k<j;k++)
		{
			System.out.println(b[k]);
		}
		// TODO Auto-generated method stub

	}

}
