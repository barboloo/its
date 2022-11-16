package com.itsdigitalacademy.corsocyber.scaffale.business;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import com.itsdigitalacademy.corsocyber.scaffale.beans.libro;
public class LeggiFile{
	static int i=0;
static File fileIn;
static ArrayList<libro> scaffale= new ArrayList<libro>();
public static void main(String[]args){
try{
//    for (int i=0;i<55;i++) {
	fileIn = new File("C:/Users/TBarbolani/Downloads/titoli_gennaio_marzo.txt");
	FileReader reader = new FileReader(fileIn);
	BufferedReader breader= new BufferedReader(reader);
//    }
	//per tutti le righe del file
		String riga = breader.readLine();
		riga = breader.readLine();i++;
		libro lib = creaLibro(riga);
		scaffale.add(lib);
	//
	breader.close();
	//-----
		for(libro libro: scaffale){
			System.out.println(libro.toString());
		}
} catch(Exception e){
	System.err.println("si e verificato un errore:" +e.getMessage());
}
}
public static libro creaLibro(String riga) {
	String[] dati= riga.split(";");
	libro l=new libro();
	l.setCodiceSocieta(dati[0]);
	l.setDescrizioneSocieta(dati[1]);
	l.setIsbn(dati[2]);
	l.setEdizione(dati[3]);
	l.setAutore(dati[4]);
	l.setTitolo(dati[5]);
	l.setTipo(dati[6]);
	l.setDescrizioneTipo(dati[7]);
	l.setDataMagazzino(dati[8]);
	l.setTitolo(dati[9]);
	l.setDataVendita(dati[10]);
	
	return l;
}
}