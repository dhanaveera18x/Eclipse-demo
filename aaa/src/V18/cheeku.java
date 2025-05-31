package V18;
import java.util.Scanner;
class anos
{
	public  int[] prime(int n) {
		int i,j,k=0;
		int b[]=new int[n];
		for( i=2;i<=n;i++)
		{
			int count=0;
			for(j=1;j<=i;j++) {
				
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==0)
			{
				b[k]=i;
				k++;
			}
		}
		
		return b;
	}
}
public class cheeku {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		anos y=new anos();
		int c[]=y.prime(n);
		for(int i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
	}
}

	

		