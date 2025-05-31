package Work;

public class averageofnumbers {

	public static void main(String[] args) {
		float a[]= {1,2,0,-7,-6};
		float p=0,n=0,z=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				p++;
			}
			else if(a[i]<0)
			{
				n++;
			}
			else
				z++;
		}
		System.out.println(p/a.length+" ,"+z/a.length+","+n/a.length);
		// TODO Auto-generated method stub

	}

}
