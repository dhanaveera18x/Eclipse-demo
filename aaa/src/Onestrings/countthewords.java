package Onestrings;

public class countthewords {

	public static void main(String[] args) {
		String a="this is hariharan working in niit";
		char b[]=a.toCharArray();
		int c=0;
		for(int i=0;i<b.length;i++)//number of letters in string except spaces
		{
			if(b[i]!=' ')
			{
				c=i;
			}
		}
		
        System.out.println(c);
        String d[]=a.split(" ");//number of words in string
       
       System.out.println(d.length);
        
        
	}

}
