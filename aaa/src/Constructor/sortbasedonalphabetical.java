package Constructor;

public class sortbasedonalphabetical {

	public static void main(String[] args) {
		String a="djheu dbhb dbd hef ie h cec";
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].compareToIgnoreCase(b[j])>0)
				{
				String temp =b[i];
				       b[i] =b[j];
				       b[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		// TODO Auto-generated method stub

	}

}
