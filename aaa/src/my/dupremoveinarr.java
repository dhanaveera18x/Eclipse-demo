package my;

public class dupremoveinarr {

	public static void main(String[] args) {
		int a[]= { 1,2,3,4,5,6,7,5,3,2};
		int b[]=new int[a.length];
		int count;
		int k=0;
		for(int i=0;i<a.length;i++)
		{   count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
						{
					count++;
						}
				
		}
			if(count==0)
				System.out.println(a[i]);
		
		// TODO Auto-generated method stub

	}

	}
}

