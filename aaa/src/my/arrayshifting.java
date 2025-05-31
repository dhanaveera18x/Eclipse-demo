package my;
import java.util.Scanner;

public class arrayshifting {

	    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			String  a="abcdefgh";
			char []b=a.toCharArray();
			
		    char v=scan.next().charAt(0);
			for(int i=0;i<b.length;i++)
			{
				if(v==b[i])
				{ 
				System.out.println(a.substring(i,b.length)+a.substring(0,i));
				}
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub

	}

}
