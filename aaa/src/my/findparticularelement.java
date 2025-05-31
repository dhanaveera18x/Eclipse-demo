package my;
import java.util.Scanner;
import java.util.Arrays;

public class findparticularelement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]a = {1,2,3,4,5,6,7,8,9,0};
		System.out.println("enter the number");
		int b=scan.nextInt();
		int i;
		int count=0;
		
		
		for( i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		     if(count>=1)
		    {
			System.out.println("yes");
		    }
			else
			{
				System.out.println("no");
			}
		
		scan.close();
	}

	}


