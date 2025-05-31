package arraypla;
import java.util.Scanner;


 class ans {

	public static int[] result(int a[])
	{
		int b[]=new int[a.length];
		int c[]=new int[b.length];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
				b[i]=a[i+1];
		}
		for(int i=0;i<b.length-1;i++)
		{
			c[i]=b[i];
				
		}
		
		return c;
	}}
	
	public class greaterthanprevious{
	public static void main(String[] args) {
		int a[]= {3,6,-9,-5,8,5};
		ans y=new ans();
		int c[]=y.result(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
