package fr.univrouen.cv24v2.transformer;

import fr.univrouen.cv24v2.model.Cv24;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class TransformerXmlToCv24 {
    public static Cv24 convertXmlToCv24(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Cv24.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Cv24) unmarshaller.unmarshal(new StringReader(xml));
        } catch (JAXBException e) {
            throw new RuntimeException("Error converting XML to Cv24", e);
        }
    }

}
