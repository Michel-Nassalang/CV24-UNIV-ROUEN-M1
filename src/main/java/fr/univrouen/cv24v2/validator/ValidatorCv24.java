package fr.univrouen.cv24v2.validator;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

public class ValidatorCv24 {

    public static String validateCv24(String xml) throws ParserConfigurationException {
        boolean hasError = false;
        try {
            // Chargement du fichier XSD
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File("src/main/resources/modelCv24/cv24.tp1.xsd"));

            // Création du validateur
            Validator validator = schema.newValidator();

            // Validation du flux XML avec SAX
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            saxParserFactory.setNamespaceAware(true);
            SAXParser saxParser = saxParserFactory.newSAXParser();
            saxParser.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            saxParser.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            Source source = new StreamSource(new StringReader(xml));
            validator.validate(source);
        } catch (SAXParseException e) {
            hasError = true;
            System.out.println("Erreur SAX de validation de flux: " + e.getMessage());
            return "SAX de validation de flux - " + e.getMessage();
        } catch (SAXException | IOException e) {
            hasError = true;
            return "SAX de validation de flux: " + e.getMessage();
        }
        return "valid";
    }
}
