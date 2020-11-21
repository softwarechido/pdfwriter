
package com.softwarechido.app.pdfwriter;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Genera un archivo PDF
 * 
 * @author fofo
 */

public class EscritorPDF {

	/**
	 * Genera un PDF con el String enviado en contenido.
	 * 
	 * @param args no arguments needed here
	 */
	public void generarArchivo(String contenido) {

		// Creando un objeto de tipo documento
		Document document = new Document();
		try {
			// step 2:
			//Creamos un escuchador del documento y lo mapeamos al
			// archivo poesia.pdf
			PdfWriter.getInstance(document,
					new FileOutputStream("poesia.pdf"));

			// Abrimos el documento
			document.open();
			
			// Le agregamos el parrafo al documento
			document.add(new Paragraph(contenido));
			
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		// step 5: we close the document
		document.close();
	}
}