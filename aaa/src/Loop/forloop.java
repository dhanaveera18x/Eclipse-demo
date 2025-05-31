package Loop;
import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		int i,j;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter i");
		
		System.out.println("enter j");
		
		for(i=scan.nextInt(),j=scan.nextInt();i<=j;i++)
		{
			System.out.println(i);
		}
		scan.close();
		
		// TODO Auto-generated method stub

	}

}
