package Twodimarray;
import java.util.Scanner;
class addt{
    public static void main (String args[]){
        Scanner scan=new Scanner (System.in);
        int[] []a=new int[3][3];
        int [][]b=new int[3][3];
        int [][]c=new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                b[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
               System.out.println( c[i][j]);
            }
        }
    }
}