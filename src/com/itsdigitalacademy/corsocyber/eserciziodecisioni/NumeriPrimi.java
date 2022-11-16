package com.itsdigitalacademy.corsocyber.eserciziodecisioni;
import java.util.Scanner;
public class NumeriPrimi{
	public static void main(String[] args) {
		int seEprimo=1;
		int divisore;
		int verifica=0;
		int contatore=0;
		int obbiettivoContatore=0;		
		Scanner t =new Scanner(System.in);
		System.out.println("immetti un numero:");
		int n = t.nextInt();
		for(seEprimo=1;seEprimo<n;seEprimo++) {
			contatore=0;
			obbiettivoContatore=0;
			for (divisore=2;divisore<seEprimo;divisore++) 
				{
				verifica=(seEprimo/divisore)*divisore;
				obbiettivoContatore=seEprimo-2;
				if (verifica!=seEprimo)  {contatore++;}
				}
			if (contatore==obbiettivoContatore) {System.out.print(seEprimo+", ");}
			else {/*System.out.println(seEprimo+" non e primo");*/}
		}
	}
}
/*Scrivi un programma che richiede all'utente un numero intero e quindi stampa
tutti i numeri primi fino a quel numero intero.
Per esempio, quando l'utente immette 15, il programma dovrebbe stampare:
2 3 5 7 11 13
(Un numero è primo se non è divisibile per nessun numero tranne 1 e se stesso)*/