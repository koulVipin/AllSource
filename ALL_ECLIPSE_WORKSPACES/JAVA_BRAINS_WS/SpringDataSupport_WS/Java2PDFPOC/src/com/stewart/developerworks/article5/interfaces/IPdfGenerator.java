package com.stewart.developerworks.article5.interfaces;

import java.io.IOException;
import java.io.OutputStream;

import org.xml.sax.SAXException;

/**
 * The Interface IPdfGenerator.
 */
public interface IPdfGenerator {
	
	/**
	 * Generate.
	 * 
	 * @param object the object
	 * @param stylesheetPath the stylesheet path
	 * @param pdfContent the pdf content
	 * 
	 * @return the output stream
	 * @throws IOException 
	 * @throws SAXException 
	 */
	OutputStream generate(IXmlSerializable object, String stylesheetPath, OutputStream pdfContent) throws SAXException, IOException;
}
