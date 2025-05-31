package Strings;

 class Name {
	
  char[] reverse(String a){

char[] b=a.toCharArray();
char c[]=new char[b.length];
for(int i=b.length-1,j=0;i>=0;i++,j--)
{
c[j]=b[i];
}
for(int i=0;i<b.length-1;i++){
if(c[i]==b[i]);

}
return c;
}

public static void main(String args[])
{
String a="hello";
Name g=new Name();
char[] z=g.reverse(a);
System.out.println(z);
}
 }
