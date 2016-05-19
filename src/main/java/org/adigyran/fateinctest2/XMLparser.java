/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adigyran.fateinctest2;

import java.io.StringReader;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

/**
 *
 * @author adigyran
 */
public class XMLparser {
    private String XMLStringin;
    private Document XMLDocument;
    public XMLparser() {
        
        
    }
    private static final Logger LOG = Logger.getLogger(XMLparser.class.getName());

   public static Document loadXMLFromString(String xml) throws Exception
{
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    InputSource is = new InputSource(new StringReader(xml));
    return (Document) builder.parse(is);
}

    public Document getXMLDocument() {
        return XMLDocument;
    }

    public void setXMLStringin(String XMLStringin) {
        this.XMLStringin = XMLStringin;
    }

  
    
}
