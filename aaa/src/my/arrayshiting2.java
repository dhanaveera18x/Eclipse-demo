package my;

import java.util.ArrayList;
import java.util.Scanner;
public class arrayshiting2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> y=new ArrayList<Integer>();
		int b[]= {1,2,3,4,5,6};
		int c=scan.nextInt();
		int i=0;
		for( i=0;i<b.length;i++)
		{
			if(c==b[i])
			{
				for(int j=i;j<b.length;j++)
				{
				y.add(b[j]);
				
				}
				
			}}
		
			for(int k=0;k<c-1;k++)
			{
			y.add(b[k]);
			}
		
			
			System.out.println(y);
		// TODO Auto-generated method stub

	}

}
