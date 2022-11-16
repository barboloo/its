package com.itsdigitalacademy.corsocyber.eserciziodecisioni;
import java.util.Scanner;
public class fattori {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		System.out.println("immetti un numero di max 5 cifre >0");
		int n = t.nextInt();
		int q=0;
		do {
			for (int i=2;i<10000;i++){
				q=(n/i)*i;
				if(q==n) {
					System.out.println(i);
					n=n/i;
				}
			}
		}while(n!=1);
	}
}
/*Scrivete un programma che chiede all'utente un numero intero e quindi stampa
tutti i suoi fattori.
Per esempio, se l'utente immette 150, il programma dovrebbe stampare: 2 3 5 5*/