package com.softwarechido.app.pdfwriter;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main(String[] args) {
		
		
		EscritorPDF myEscritor = new EscritorPDF();
		
		myEscritor.generarArchivo("¿Me preguntas mi amor que es poesia?... \n\n \t\t Poesia eres tu...");
		
		
	}
}
