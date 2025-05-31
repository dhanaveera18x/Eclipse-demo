package One;

public class hh {

	public static void main(String[] args) {
		String a="hari ha ran";
		int count=0;
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(" ".contains(b[i]+" "))
					{ 
				count++;
					}
		}
		
System.out.println(count);
	}

}
