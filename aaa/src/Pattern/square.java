package Pattern;

public class square {

	public static void main(String[] args) {
		int i,j=4,n=4,s;
		for(i=0;i<n;i++)
		
		{
		for(s=0;s<(n-i-1);s++)
		{
			System.out.print(" ");
		}
			for(j=0;j<i*2+1;j++)
			{
			System.out.print("*");
			
			}
			
			System.out.println(" ");
		}
		

	}
}


