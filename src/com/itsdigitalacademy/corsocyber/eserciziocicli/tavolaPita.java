package com.itsdigitalacademy.corsocyber.eserciziocicli;
public class tavolaPita {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i*j + " ");
				if (i*j< 10) {
					System.out.print(" "); 
				}
			}
			System.out.println();
		}
	}
}

/*package com.itsdigitalacademy.corsocyber.eserciziocicli;
public class tavolaPita {
	public static void main(String[] args) {
		int[] r1= new int[10];
		int[] r2= new int[10];
		int[] r3= new int[10];
		int[] r4= new int[10];
		int[] r5= new int[10];
		int[] r6= new int[10];
		int[] r7= new int[10];
		int[] r8= new int[10];
		int[] r9= new int[10];
		int[] r10= new int[10];
		int e=1;
		for (int i=0;i<r1.length;i++)
		{
		r1[i] = 1*e;
		r2[i] = 2*e;
		r3[i] = 3*e;
		r4[i] = 4*e;
		r5[i] = 5*e;
		r6[i] = 6*e;
		r7[i] = 7*e;
		r8[i] = 8*e;
		r9[i] = 9*e;
		r10[i] =10*e;
		e++;
		}
		for (int i=0;i<r1.length;i++)
		{
		System.out.print("  "+r1[i]);
		System.out.print(" "+r2[i]);
		System.out.print(" "+r3[i]);
		System.out.print(" "+r4[i]);
		System.out.print(" "+r5[i]);
		System.out.print(" "+r6[i]);
		System.out.print(" "+r7[i]);
		System.out.print(" "+r8[i]);
		System.out.print(" "+r9[i]);
		System.out.println(" "+r10[i]);	
		}	
	}
}
*/