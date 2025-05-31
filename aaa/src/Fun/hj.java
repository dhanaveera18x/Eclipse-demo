package Fun;
import java.util.Scanner;
class hello{
	public static int[] sul (int a[])
	{
int k=0,j=0;
		
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
			b[k]=a[i];
			k++;
		}
		else
		{
			c[j]=a[i];
			j++;
		}}
		for(int i=0;i<b.length;i++)
		{
			if(i<k)
			{
				a[i]=b[i];
		}
			else
			{
				a[i]=c[i];
			}
		}
		return a;
	}
}
public class hj {
	public static void main (String args) {
		Scanner scan=new Scanner(System.in);
		hello y=new hello();
		int a[]= {1,5,8,3,4,6,8,90,62};
		int g[]=y.sul(a);
		for(int i=0;i<a.length;i++)
			
		{
			System.out.println(g[i]);
			
		}
		
		
		
	}

}
