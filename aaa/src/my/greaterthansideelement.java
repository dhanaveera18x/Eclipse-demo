package my;

public class greaterthansideelement {

	public static void main(String[] args) {
		int a[]= {1,10,3,4,5,6,7,8,9};
		
		int i;
		for( i=1;i<a.length-1;i=i+3)
		{
			int k=a[i];
			a[i]=a[i+1];
			a[i+1]=k;
		}
		System.out.println("greater thansideelement");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
           
}
