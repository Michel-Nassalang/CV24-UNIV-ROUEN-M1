package fr.univrouen.cv24v2.transformer;

import fr.univrouen.cv24v2.model.Cv24;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;

public class TransformerXmlToCv24 {
    public static Cv24 convertXmlToCv24(String xml) {

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Cv24.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Cv24 cv24 = (Cv24) jaxbUnmarshaller.unmarshal(new StringReader(xml));

            System.out.println(cv24.toString());
            return cv24;
        }
        catch (JAXBException e)
        {
            throw new RuntimeException("Erreur conversion XML vers Cv24", e);
        }
    }

}
