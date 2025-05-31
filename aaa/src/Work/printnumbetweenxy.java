package Work;
import java.util.Scanner;

public class printnumbetweenxy {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		int a[]= {1,2,8,4,2,4,89,25};
		int x=scan.nextInt();
		int y=scan.nextInt();
		int c;
		if(x<y)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>x && a[i]<y)
				{
					System.out.println(a[i]);
				
				}
			}
			
		}
		
			else
			{
				System.out.println("x<y");
			}
		}
		
	}


