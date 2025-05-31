package dsa;

public class longword {

	public static void main(String[] args) {
		String a=" hariharan gyugyegegdey ie a good boy";
		String b[]=a.split(" ");
		String c="";
		int max=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].length()>max)
			{
				c=b[i];
				max=b[i].length();
			}
		}
		System.out.println(c);
		
		// TODO Auto-generated method stub

	}

}
