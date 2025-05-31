package my;
import java.util.Scanner;
import java.util.Arrays;

public class onearraytoanother {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the size of the array=");
		int i;
		int num=scan.nextInt();
		System.out.println("enter the elements in the array=");
		int []a=new int[num];
        for(i=0;i<num;i++)
         {
	
         a[i]=scan.nextInt();
        for(int j=0;j<num;i++)
        {
        	System.out.println(a[i]);
        }
       
        int[]b=new int[num];
        for(i=0;i<num;i++)
        {
        	 b[i]=a[i];
        	 
        }
      
       System.out.println("b[i]="+Arrays.toString(b));
        scan.close();
	}

	}
}

