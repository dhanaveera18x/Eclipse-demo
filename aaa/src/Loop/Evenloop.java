package Loop;
import java.util.Scanner;

public class Evenloop {

	public static void main(String[] args) {
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a");
		i=scan.nextInt();
		
		System.out.println("enter b");
		j=scan.nextInt();
		
		for(;i<=j;i++) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
		
		
		
	
		
	}

}
