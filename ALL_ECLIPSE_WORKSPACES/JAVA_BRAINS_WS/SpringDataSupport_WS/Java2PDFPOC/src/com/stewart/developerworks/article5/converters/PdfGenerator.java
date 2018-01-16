package com.stewart.developerworks.article5.converters;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.xml.sax.SAXException;

import com.stewart.developerworks.article5.interfaces.IPdfGenerator;
import com.stewart.developerworks.article5.interfaces.IXmlSerializable;

public class PdfGenerator implements IPdfGenerator {

	@Override
	public OutputStream generate(IXmlSerializable object, String stylesheetPath, OutputStream pdfContent) throws SAXException, IOException {

		try {
			// setup xml input source
			String xml = object.toXml();
			StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(xml.getBytes()));

			// setup xsl stylesheet source
			File xslFile = new File(stylesheetPath);
			FileInputStream xslFileStream = new FileInputStream(xslFile);
			StreamSource xslSource = new StreamSource(xslFileStream);

			// get transformer
			TransformerFactory tfactory = TransformerFactory.newInstance();
			Transformer transformer = tfactory.newTransformer(xslSource);

			// setup FOP
			//FopFactory fopFactory = FopFactory.newInstance();
			File f = new File("C:\\Users\\vipin.koul\\Desktop\\XMLToPDF\\PO.pdf");
			FopFactory fopFactory = FopFactory.newInstance(f);
			FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
			foUserAgent.setProducer(this.getClass().getName());
			Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent,
					pdfContent);
			
			// perform transformation 
			Result res = new SAXResult(fop.getDefaultHandler());
			transformer.transform(xmlSource, res);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (FOPException e) {
			e.printStackTrace();
		}
		
		return pdfContent;
	}

}
