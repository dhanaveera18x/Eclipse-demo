package V18;
import java.util.Scanner;
public class klrf {
    public static void prime(int n){

            int sum=0;
	        int i;
	        for( i=1;i<=n;i++)
	        {
	            if(i%2!=0)
	            {
	                sum=sum+i;
	            }
	        }
	        System.out.println(i);
	        
    }



	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		 prime(n);
	        
	    }
	}


