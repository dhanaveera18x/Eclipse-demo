package V18;
import java.util.Scanner;
public class primenumbersbetween {
	
	public static void prime(int a) {
		int c[]=new int[10];
		int k=0;
	for(int i= 1;i<a;i++)
	{
		int count=0;
		for(int j=1;j<a;j++)
		{
			if(i%j==0)
			{
				count++;
			}}
			if(count==2)
			{
				System.out.println(i);	
				
			}
			
			
		}}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		primenumbersbetween y=new primenumbersbetween();
		y.prime(a);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
