package my;
import java.util.Arrays;
public class evennumandodd {

	public static void main(String[] args) {
		int a[]	= {1,2,3,4,5,6,7,8};
		int b[]= new int [a.length];
		
		int i=0;
		int j=0;
		
		for( i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				b[j++]=a[i];
			}
		}
				
			for( i=0;i<a.length;i++)
			{
				if(!(a[i]%2==0))
				{
					b[j++]=a[i];
				}
			}
		
		
		System.out.println(Arrays.toString(b));

	}

}
