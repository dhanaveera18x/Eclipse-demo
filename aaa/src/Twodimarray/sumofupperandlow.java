package Twodimarray;

class soo{
public int[] ee (int[][] a)
{

int ans[]=new int[2];
int up=0,i=0,j=0;
int lo=0;
for( i=0;i<a.length;i++)
{
for( j=0;j<a[i].length;j++)
{
if(i<=j)
{
up=up+a[i][j];
}
if(i>=j)
{
lo=lo+a[i][j];
}
}
}
ans[0]=up;
ans[1]=lo;
return ans;
}}
 class sumofupperandlow{
public static void main(String args[]){


int a[][]={{1,2,3},
           {4,5,6},
           {7,8,9}};
soo y=new soo();
int b[]=y. ee(a);
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}}


	
		// TODO Auto-generated method stub


 }
