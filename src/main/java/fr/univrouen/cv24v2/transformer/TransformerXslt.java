package fr.univrouen.cv24v2.transformer;

import fr.univrouen.cv24v2.model.CvList;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import fr.univrouen.cv24v2.model.Cv24;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Objects;

public class TransformerXslt {
    public static String Cv24toHTML(Cv24 cv) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource xmlSource = new StreamSource(new StringReader(Objects.requireNonNull(cvToXmlString(cv))));
        StreamSource xsltfile = new StreamSource("src/main/resources/modelCv24/cv24.xslt");

        Transformer transformer = transformerFactory.newTransformer(xsltfile);

        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(xmlSource, result);

        return writer.toString();
    }

    public static String cvToXmlString(Cv24 cv) {
        try {
            JAXBContext context = JAXBContext.newInstance(Cv24.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(cv, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String listCv24toHTML(CvList cvList) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        StreamSource xmlSource = new StreamSource(new StringReader(Objects.requireNonNull(listCvToXmlString(cvList))));
        StreamSource xsltfile = new StreamSource("src/main/resources/modelCv24/cv24list.xslt");

        Transformer transformer = transformerFactory.newTransformer(xsltfile);

        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(xmlSource, result);

        return writer.toString();
    }

    public static String listCvToXmlString(CvList cvList) {
        try {
            JAXBContext context = JAXBContext.newInstance(CvList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter writer = new StringWriter();
            marshaller.marshal(cvList, writer);
            return writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
