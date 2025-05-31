package sorting;

public class bubblesort {

	public static void main(String[] args) {
		int a[]= {5,4,3,2,1};
		boolean swap;
		for(int i=0;i<a.length-1;i++)
		{
			swap=false;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swap=true;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
