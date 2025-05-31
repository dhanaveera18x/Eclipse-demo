package Constructor;

public class substri2 {

	public static void main(String[] args) {
    String a="dehehb";
    String c="";
    int max=0;
    for(int i=0;i<a.length();i++)
    {
    	for(int j=i;j<a.length();j++)

    	{
    		String b=a.substring(i,j+1);
    		if( max<b.length())
    		{
    		   c=b;
    		max=b.length();	
    		}
    }
    }
    System.out.println(c);


}
}

