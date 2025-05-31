
package my;
import java.util.Scanner;
import java.util.Arrays;

public class insertarray {


    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
		
		
		int i;
		
		int  a[]=new int[6];
		
		for( i=0;i<5;i++)
		{
		 
		
		a[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("enter position");
		int b=scan.nextInt();
		System.out.println("value");
		int c=scan.nextInt();
		for(i=5;i>b;i--)
		{
			a[i]=a[i-1];
		}
		
		a[b]=c;
		System.out.println(Arrays.toString(a));
	}

}
//import java.util.*;
//
//public class Main {
//  public static int [] ans(int a[])
//  {
//    int k=4;
//    int m=9;
//    int b[]=new int[a.length+1];
//    for(int i=0;i<a.length;i++)
//    {
//      b[i]=a[i];
//    }
//    for(int i=b.length-1;i>k;i--)
//    {
//      b[i]=b[i-1];
//    }
//    b[k]=m;
//    return b;
//    
//  }
//  public static void main(String args[]){
//   int a[]={4,5,6,3,2,9};
//   int c[]=ans(a);
//   for(int i=0;i<c.length;i++)
//   {
//   System.out.println(c[i]);
//   }
//     
//  }
//}

