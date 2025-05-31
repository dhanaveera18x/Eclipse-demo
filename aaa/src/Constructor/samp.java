package Constructor;
import java.util.Scanner;
public class samp {
	
	String x;
	int y;
       samp(String x,int y) {
    	
    	this.x= x;
    	this.y=y;
	
    	
                }
       
    

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String x=scan.nextLine();
		int  y=scan.nextInt();
		samp obj=new samp(x,y);
		System.out.println(obj.);
		
		// TODO Auto-generated method stub

	}

}
