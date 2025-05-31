package Pattern;
import java.util.Scanner;
public class new11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int s=0;s<(n-i-1);s++)
			{	
				System.out.print("  ");
		}
			
			for(int j=0;j<((i*2)+1);j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		
			
		// TODO Auto-generated method stub
		}
	
}}
