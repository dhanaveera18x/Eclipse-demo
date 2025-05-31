package Oops;
import java.util.Scanner;
 class rahul{
	
	public void info (int a,String b,int c){
		System.out.println(a+" "+b+"  "+c);
		
		
	}
	
}

public class basic4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the jersey no");
		int a=scan.nextInt();
		System.out.println("enter the score");
		int c=scan.nextInt();
		System.out.println("enter the team");
		String b=scan.next();
		
		
		rahul y=new rahul();
		y.info(a,b,c);
		
		
		// TODO Auto-generated method stub

	}

}
