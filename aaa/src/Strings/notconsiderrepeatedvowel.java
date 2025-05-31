package Strings;

public class notconsiderrepeatedvowel {

	public static void main(String[] args){
    String a="aeiiou@123",b="";
	int c=0;
	for(char z:a.toCharArray())
	{
		if(!b.contains(z+""))
	  
	  {
		 b=b+z;
		 
	  }
	}
	
	  System.out.println(b);
	  
	}

}

		

