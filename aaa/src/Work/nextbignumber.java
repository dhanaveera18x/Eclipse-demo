package Work;

public class nextbignumber {

	public static void main(String[] args) {
		int a[]= {9,8,7,6,5,4,3,2,1};
		int i,j,c=0;
		for( i=0;i<a.length;i++)
		{
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
			
		}
		
		for(i=a.length-1;i<a.length;i++)
		{
			c=a[i];
		
		
		}
		int big=c;
		for( i=0;i<a.length;i++)
		{
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) 
				{
					big=a[j];
					
				 	
				}
			}
			
		}
		
	}
}

