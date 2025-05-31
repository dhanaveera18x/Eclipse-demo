package Strings;

public class largestwordinstri {

	public static void main(String[] args) {
		String a="is hariharan is good";
		String b[]=a.split(" ");
		int sum=0;
		String c="";
		for(int i=0;i<b.length;i++)
		{int count=0;
			for(int j=0;j<b[i].length();j++)
			{
				count++;
			}
			if(sum<count)
			{
				sum=count;
				c=b[i];
				
			}
			
		}
		System.out.println(c+sum);
		// TODO Auto-generated method stub

	}

}
