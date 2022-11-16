package com.itsdigitalacademy.corsocyber.eserciziodecisioni;
import java.util.Scanner;
public class romboAsterischi {
	public static void main(String[] args) {
		System.out.println("immetti un numero");
		Scanner t =new Scanner(System.in);
		int n = t.nextInt();
		int spazi=n;
		int asterischi=1;
		int contat=0;
		do {
		for (int i=0;i<spazi;i++ ) {
			System.out.print(" ");
		}
		for (int i=0;i<asterischi;i++ ) {
			System.out.print("*");
		}
		System.out.println("");
		contat++;
		spazi--;
		asterischi+=2;
		}
		while(contat!=n);
		do {
			for (int i=0;i<spazi;i++ ) {
				System.out.print(" ");
			}
			for (int i=0;i<asterischi;i++ ) {
				System.out.print("*");
			}
			System.out.println("");
			contat--;
			spazi++;
			asterischi-=2;
			}
			while(contat!=-1);
	}
}

/*Scrivi un programma che legge un numero intero e visualizza, usando asterischi,
un rombo pieno della lunghezza del lato dato.
Per esempio, se la lunghezza del lato è 4, il programma dovrebbe visualizzare:
   *
  ***
 *****
*******
 *****
  ***
   *
se la lunghezza del lato è 2:
 *
***
 *
*/
