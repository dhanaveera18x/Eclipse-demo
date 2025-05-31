package One;

public class b {

	public static void main(String[] args) {
		String a="aeiou q";
		char[]b=a.toCharArray();
		int vo=0,sp=0,co=0;
		for(int i=0;i<b.length;i++)
		{
			if("aeiou".contains(b[i]+""))
			{
			vo++;	
			}
			
			
			if(" ".contains(b[i]+""))
			{
				sp++;
			}
			if(!"aeiou".contains(b[i]+"")&&" ".contains(b[i]+""))
			{
				co++;
			}

		}
		System.out.println(vo);
		System.out.println(sp);
		System.out.println(co);
		
		// TODO Auto-generated method stub

	}

}
