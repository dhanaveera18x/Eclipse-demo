package Twodimarray;

public class ksudvgl {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		int[] c= new int[a.length+b.length];
		
		int ap=0,bp=0,cp=0;
		
		while(ap<a.length && bp<b.length) {
			if(a[ap++] < b[bp++]) {
				c[cp++] = a[ap++];
			}
			else {
				c[cp++] = b[bp++];
			}
		}
		while(ap<a.length) {
			
		}
	}

}
