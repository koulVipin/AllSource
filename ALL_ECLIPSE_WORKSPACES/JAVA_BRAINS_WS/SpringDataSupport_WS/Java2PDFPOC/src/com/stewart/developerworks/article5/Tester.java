package com.stewart.developerworks.article5;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

import com.stewart.developerworks.article5.bal.entities.address.Address;
import com.stewart.developerworks.article5.bal.entities.purchaseorder.OrderItem;
import com.stewart.developerworks.article5.bal.entities.purchaseorder.PurchaseOrder;
import com.stewart.developerworks.article5.converters.PdfGenerator;
import com.stewart.developerworks.article5.interfaces.IAddress;
import com.stewart.developerworks.article5.interfaces.IOrderItem;
import com.stewart.developerworks.article5.interfaces.IPurchaseOrder;

public class Tester {

	public static IPurchaseOrder getPurchaseOrder() {
		IPurchaseOrder po = new PurchaseOrder("PO-123-456789");
		po.setOrderDate(new Date());
		
		IAddress coAddress = new Address();
		coAddress.setCompanyName("ACME Company");
		coAddress.setStreetAddress("123 Main Street");
		coAddress.setCity("Orlando");
		coAddress.setState("FL");
		coAddress.setZipCode("32801");
		po.setCompanyAddress(coAddress);
		
		IAddress custAddress = new Address();
		custAddress.setCompanyName("A++");
		custAddress.setStreetAddress("123 8th Avenue");
		custAddress.setCity("Orlando");
		custAddress.setState("FL");
		custAddress.setZipCode("32801");
		po.setCustomerAddress(custAddress);
		
		IOrderItem item = new OrderItem();
		item.setItemId("A1B2C3");
		item.setItemName("Widget");
		item.setQuantity(100);
		item.setItemCost(100.50f);
		po.addItem(item);
		
		item = new OrderItem();
		item.setItemId("C3B2A1");
		item.setItemName("Micro-Widget");
		item.setQuantity(1000);
		item.setItemCost(10.750f);
		po.addItem(item);
		
		return po;
	}
	public static void main(String[] args) throws SAXException, IOException {
		IPurchaseOrder po = Tester.getPurchaseOrder();
		
		// setup output stream
		FileOutputStream pdfContentStream = null;
		BufferedOutputStream pdfContent= null;
		try {
			File pdfFile = new File("C:\\Users\\vipin.koul\\Desktop\\XMLToPDF\\PO.pdf");
			pdfContentStream = new FileOutputStream(pdfFile);
			pdfContent = new BufferedOutputStream(pdfContentStream);
			System.out.println(po.toXml());
			PdfGenerator generator = new PdfGenerator();
			generator.generate(po, "C:\\Users\\vipin.koul\\Desktop\\XMLToPDF\\PurchaseOrder.xsl", pdfContent);
			//Tester.transform(po.toXml(), "D:/workspace/DwArticle5/resources/PurchaseOrder.xsl");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		finally {
			if (pdfContent != null)
				try {
					pdfContent.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	private static void transform(String xml, String styleSheet) {
		try {
			StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(
					xml.getBytes()));

			// setup xsl stylesheet source
			File xslFile = new File(styleSheet);
			FileInputStream xslFileStream = new FileInputStream(xslFile);
			StreamSource xslSource = new StreamSource(xslFileStream);

			// get transformer
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer(xslSource);

			// perform transformation
			StreamResult res = new StreamResult(System.out);
			transformer.transform(xmlSource, res);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
