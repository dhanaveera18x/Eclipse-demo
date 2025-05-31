package my;


class one{
	
	int [] mike(int a[]) {
		int b[]=new int[a.length];
		int k=0,g=0;
		for(int i=0;i<a.length;i++)
		{int count=0;
			for(int j=1;j<=a[i];j++)
				
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				b[k]=a[i];
				k++;
				g++;
			}
		}
		return b;
		
	}
}

public class arrayprime {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		one y=new one();
		int c[]=y.mike(a);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		// TODO Auto-generated method stub

	}

}
