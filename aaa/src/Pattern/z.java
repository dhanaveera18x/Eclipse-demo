package Pattern;
import java.util.Scanner;

public class z {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=5,i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==0||j==2||j==4||(i==0&&j==3)||i==4&&j==3||(i==2&&j==3))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}

	}

}
