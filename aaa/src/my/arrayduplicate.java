package my;

public class arrayduplicate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}}
		}
		// TODO Auto-generated method stub

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
