package Oops;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class sentencearraylist {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		ArrayList<String> y=new ArrayList<String>();
		String h=scan.nextLine();
		Collections.sort(y);
		String b[]=h.split(h+" ");
		for(int i=0;i<b.length;i++)
		{
			
			y.add(b[i]);
		}
		Collections.sort(y);
		System.out.print(y);
		
		// TODO Auto-generated method stub

	}

}
