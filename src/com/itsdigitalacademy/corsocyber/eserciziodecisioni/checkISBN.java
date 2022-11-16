package com.itsdigitalacademy.corsocyber.eserciziodecisioni;
import java.util.Scanner;
public class checkISBN {
	public static void main(String[] args) {
		int q=0,w=0;
		Scanner t=new Scanner(System.in);
		System.out.println("inserisci ISBN: ");		
		String codice1= t.nextLine();
		if (codice1.length()!=12) 
		   {System.out.println("non e un ISBN");}
		else
				{for (int i=0; i<codice1.length();i=i+2)
					{System.out.println((Character.getNumericValue(codice1.charAt(i))));	
					q= (q+(Character.getNumericValue(codice1.charAt(i))));}
				for (int i=1; i<codice1.length();i+=2)
					{System.out.println((Character.getNumericValue(codice1.charAt(i))));	
					q= q+((Character.getNumericValue(codice1.charAt(i)))*3);}}
		w=((q/10)*10)+10;
		System.out.println("il codice di controllo e: "+ (w-q));}}






