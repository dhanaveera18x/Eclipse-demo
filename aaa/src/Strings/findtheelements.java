package Strings;

public class findtheelements {

	public static void main(String[] args) {
		String a="Hari@123";
		int up=0,lo=0,num=0,sym=0;
		for(char z:a.toCharArray())
		  if(Character.isLowerCase(z))
		  {
			  up++;
		  }
		  else  if(Character.isUpperCase(z))
		  {
			  lo++;
		  }
		  else if(Character.isDigit(z))
		  {
			  num++;
		  }
		  else
		  {
			  sym++;
		  }
		  System.out.println(up);
		  System.out.println(lo);
		  System.out.println(num);
		  System.out.println(sym);
		
			

	

	}

}
