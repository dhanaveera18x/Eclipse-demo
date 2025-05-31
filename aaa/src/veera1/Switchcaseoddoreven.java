package veera;
import java.util.Scanner;

public class Switchcaseoddoreven {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		switch(a%2)
		{
		case 0:
			System.out.print("even");
		     break;
		default:
			System.out.print("odd");
			

		
		}
		
		

	}

}
