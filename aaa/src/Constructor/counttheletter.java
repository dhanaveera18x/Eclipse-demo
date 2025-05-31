package Constructor;

public class counttheletter {

	public static void main(String[] args) {
		String a="bhj hd";
		String b[]=a.split(" ");
		
		for(int i=0;i<b.length;i++)
		{int count=0;
			for(int j=0;j<b[i].length();j++)
			{
				count++;
				
			}
			System.out.println(b[i]+""+count);
		}
		
		// TODO Auto-generated method stub

	}

}
