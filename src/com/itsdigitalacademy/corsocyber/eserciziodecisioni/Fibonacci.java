package com.itsdigitalacademy.corsocyber.eserciziodecisioni;
import java.util.Scanner;
public class Fibonacci {
	public int fionacci (int n) {
//		public static void main(String[] args) {
//			Scanner t =new Scanner(System.in);
//			System.out.println("immetti un numero N");
//			int n = t.nextInt();
			int u=1,u1=2,u2=0;
			System.out.println("N esimo numero della seq. di Fibonacci ");
			for (int i=0;i<(n-1);i=i) {
				i++;
				u2=u+u1;
				u=u1;
				u1=u2;
			}System.out.println(u);
		//}
	return u;
	}
}	
/*Scrivete un programma che dato un intero maggiore di 2, stampa il suo numero di
Fibonacci.
Per implementare l'algoritmo usate un ciclo for (non la ricorsione)*/