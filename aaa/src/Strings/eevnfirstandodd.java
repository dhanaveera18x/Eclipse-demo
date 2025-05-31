package Strings;

 class my{
	 
 
	public static int[] myarr() {
	int []a={1,2,3,4,5,6,7,8,9};
	int [] b=new int[a.length];
	int [] c=new int[a.length];
	int j=0,k=0,i=0;
	for( i=0;i<a.length;i++)
	{
	if(a[i]%2==0)
	{
	b[j]=a[i];
	j++;
	}
	else
	{
	c[k]=a[i];
	k++;
	}
	}
	for(i=0,k=0;i<a.length;i++)
	{
	if(i<j)
	{
	a[i]=b[i];
	}
	else
	{
	a[i]=c[k];
	k++;
	}}
	return a;
	}}
	public class eevnfirstandodd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      my y=new my();
      int d[]=y.myarr();
      for(int i=0;i<d.length;i++)
      {
    	  System.out.println(d[i]);
      }
	}

}
