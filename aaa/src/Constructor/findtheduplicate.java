package Constructor;

public class findtheduplicate {

	public static void main(String[] args) {
		String a="hi i am i am hello";
		String c[]=a.split(" ");
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i].equals(c[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(c[i]);
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
