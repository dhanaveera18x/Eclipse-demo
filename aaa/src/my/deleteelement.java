package my;
import java.util.Scanner;

public class deleteelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);    
		int a[]= {1,2,3,4,5,6};
        System.out.println("enter the position");
        int b=scan.nextInt();
        for(int i=b;i<a.length-2;i++)
        	
        {
        	a[i]=a[i+1];
        	
        }
        for(int  i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
	}

}
