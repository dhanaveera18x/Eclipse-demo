																																																																																																																																																																															package Strings;

public class example {

	public static void main(String[] args) {
		String a="hariharan";
		String b="";
		char c[]=a.toCharArray();
		
	    for(int i=0;i<c.length;i++)
	    {
	    	if(!b.contains (c[i]+""))
	    	{
	    		b+=c[i]+"";
	    		
	    	}
	    }
	    System.out.println(b);
	    char[] d=b.toCharArray();
	    for(int i=0;i<d.length;i++)
	    {
	    	int  count=0;
	    	for(int j=0;j<c.length;j++)
	    	{
	    		if(d[i]==c[j])
	    		{
	    			count++;
	    		}
	    	}
	    	System.out.println(d[i]+""+count);
	    }
	}
		
	}


