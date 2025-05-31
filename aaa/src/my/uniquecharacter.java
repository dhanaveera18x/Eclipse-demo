package my;
import java.util.Scanner;
import java.util.ArrayList;
class unique{
	
	ArrayList<Integer> uniquecharc(int a[]) {
		ArrayList<Integer> y=new ArrayList<> ();
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if((a[i]==a[j]))
				{
					count++;
				}}
					if(count==1)
					{
						y.add(a[i]);
					}
									
			
		}
		return y;
		
	}


		
}

public class uniquecharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		unique y=new unique();
		int[] a= {1,2,3,4,5,7,5,4,3};
		ArrayList<Integer> z=y.uniquecharc(a);
		System.out.println(z);
		
		// TODO Auto-generated method stub

	}

}
