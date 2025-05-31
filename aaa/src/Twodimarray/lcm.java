package Twodimarray;
import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner scan=new Scanner( System.in);
		int a=scan.nextInt(),b=scan.nextInt();
		int max;
		if(a>b)
		{
			 max=a;
		}
		else
		{
			max=b;
		}
		while(true)
		{
			if(max%a==0&&max%b==0)
					{
			System.out.println(max);
		}
			for(int i=c;;i++)
			{
				if(i%a==0&&i%b==0)
				{
					System.out.println(i);
					 break;
				}
			}
		
		
		}
		

	}

}
