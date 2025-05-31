package Constructor;

public class sortbasedonsize {

	public static void main(String[] args) {
		String a ="hello how ur doingnow";
		String b[]=a.split(" ");
		int i=0;
		for(i=0;i<b.length-1;i++)
			for(int j=0;j<b.length-1-i;j++)
		{
			if(b[j].length()>b[j+1].length())
			{
				String temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}
		for(int k=0;k<b.length;k++)
		{
		System.out.println(b[k]);
		}
		// TODO Auto-generated method stub

	}

}
