package com.vipin.main;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.vipin.domain.HTDummy;

public class MainApp {

	public static void main(String[] args) throws IOException {
		
		
		HTDummy htDummy = new HTDummy();
    	String htDummyXML = convertHTDummyToXML(htDummy);
    	System.out.println("The converted object to xml is " +htDummyXML);
	
		/*try {
	         Document document = DocumentHelper.createDocument();
	         Element root = document.addElement( "cars" );
	         Element supercarElement= root.addElement("supercars")
		        .addAttribute("company", "Ferrai");

	         supercarElement.addElement("carname")
		        .addAttribute("type", "Ferrari 101")
		        .addText("Ferrari 101");

	         supercarElement.addElement("carname")
	            .addAttribute("type", "sports")
	            .addText("Ferrari 202");

	         // Pretty print the document to System.out
	         OutputFormat format = OutputFormat.createPrettyPrint();
	         XMLWriter writer;
	         writer = new XMLWriter( System.out, format );
	         writer.write( document );
	      } catch (UnsupportedEncodingException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }*/
	}
	
	private static String convertHTDummyToXML(HTDummy htDummy) throws IOException {
		
		String xml = null;
		Document document = DocumentHelper.createDocument();
		
		Element root = document.addElement("solution_details");
		
		Element firstLevelHeading = root.addElement("firstLevelHeading");
		Element secondLevelHeading = root.addElement("secondLevelHeading");
		
		Element Sovellustunnus = firstLevelHeading.addElement("Sovellustunnus");
		Sovellustunnus.addText(htDummy.getSovellustunnus());
		
		Element Asiakirjatyyppi = firstLevelHeading.addElement("Asiakirjatyyppi");
		Asiakirjatyyppi.addText(htDummy.getAsiakirjatyyppi());
		
		Element AsiakirjanSaapumiskanava = firstLevelHeading.addElement("AsiakirjanSaapumiskanava");
		AsiakirjanSaapumiskanava.addText(htDummy.getAsiakirjanSaapumiskanava());
		
		Element AsiakirjanSaapumispäivä = firstLevelHeading.addElement("AsiakirjanSaapumispäivä");
		AsiakirjanSaapumispäivä.addText(htDummy.getAsiakirjanSaapumispäivä());
		
		Element RatkaisunKuvaus = secondLevelHeading.addElement("RatkaisunKuvaus");
		RatkaisunKuvaus.addText(htDummy.getRatkaisunKuvaus());
		
		Element Käsittelijä = secondLevelHeading.addElement("Käsittelijä");
		Käsittelijä.addText(htDummy.getKäsittelijä());
		
		Element PäivämääräJaKellonaika = secondLevelHeading.addElement("PäivämääräJaKellonaika");
		PäivämääräJaKellonaika.addText(htDummy.getPäivämääräJaKellonaika());
        
		xml = document.asXML();
		return xml;
	}
}
