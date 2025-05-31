package my;

public class cominationfortarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5};
int b=4;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
	{
		if(b==a[i]+a[j])
		{
			System.out.println(a[i]+","+a[j]);
			
		}
	}
}
	}

}
