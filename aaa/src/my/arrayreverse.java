package my;

public class arrayreverse {

	public static void main(String[] args) {
		int []a= {6,2,3,4,5,6};
		int []b=new int[a.length];
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
			System.out.println(b[j]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				System.out.println(b[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
