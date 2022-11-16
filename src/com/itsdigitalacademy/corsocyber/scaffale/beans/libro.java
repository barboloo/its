package com.itsdigitalacademy.corsocyber.scaffale.beans;
public class libro{
	//javabean
	private static String codiceSocieta,descrizioneSocieta,isbn,edizione,autore,titolo,
	tipo,descrizioneTipo,dataMagazzino,dataVendita;
	private static int checkDigit;
	public static String getCodiceSocieta() {
		return codiceSocieta;
	}
	public void setCodiceSocieta(String codiceSocieta) {
		libro.codiceSocieta = codiceSocieta;
	}
	public static String getDescrizioneSocieta() {
		return descrizioneSocieta;
	}
	public void setDescrizioneSocieta(String descrizioneSocieta) {
		libro.descrizioneSocieta = descrizioneSocieta;
	}
	public static String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		libro.isbn = isbn;
	}
	public static int getCheckDigit() {
		return checkDigit;
	}
	public void setCheckDigit(int checkDigit) {
		libro.checkDigit = checkDigit;
	}
	public static String getEdizione() {
		return edizione;
	}
	public void setEdizione(String edizione) {
		libro.edizione = edizione;
	}
	public static String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		libro.autore = autore;
	}
	public static String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		libro.titolo = titolo;
	}
	public static String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		libro.tipo = tipo;
	}
	public static String getDescrizioneTipo() {
		return descrizioneTipo;
	}
	public void setDescrizioneTipo(String descrizioneTipo) {
		libro.descrizioneTipo = descrizioneTipo;
	}
	public static String getDataMagazzino() {
		return dataMagazzino;
	}
	public void setDataMagazzino(String dataMagazzino) {
		libro.dataMagazzino = dataMagazzino;
	}
	public static String getDataVendita() {
		return dataVendita;
	}
	public void setDataVendita(String dataVendita) {
		libro.dataVendita = dataVendita;
	}
	@Override
	public String toString(){
		return codiceSocieta+';'+ descrizioneSocieta+';'+isbn+';'
				+checkDigit+';'+edizione+';'+autore+';'+ 
				titolo+';'+tipo+';'+ descrizioneTipo+';'+
				dataMagazzino+';'+dataVendita;
		}
	}