package my;

public class oddascendingevendescending {

	public static void main(String[] args) {
		int a[]= {1,2,9,4,10,11,2,8,0};
		int i;
		for( i=0;i<a.length-1;i=i+2)
		{
			for(int j=i+2;j<a.length-1;j=j+2)
			{
				
			
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		for(i=0;i<a.length;i++)
		{
			
		
		
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
