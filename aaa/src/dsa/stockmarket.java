package dsa;
public class stockmarket {
	
	 int mean(int[] a){
		int min=Integer.MAX_VALUE;
		int max=0;
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
			}
			else 
			{
			 p=a[i]-min;
			 if
			 (p>max) {
				 max=p;
			 }
			
				
			}
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		
		stockmarket y=new stockmarket();
		int a[]= {7,1,3,4,5,6,2};
		int z=y.mean(a);
		
		System.out.println(z);
		// TODO Auto-generated method stub

	}

}
