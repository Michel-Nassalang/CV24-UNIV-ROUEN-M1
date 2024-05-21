package fr.univrouen.cv24v2.transformer;

import fr.univrouen.cv24v2.model.Cv24;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;
/**
 * Cette classe fournit une méthode statique pour convertir une représentation XML en un objet Cv24.
 */
public class TransformerXmlToCv24 {
    /**
     * Convertit une représentation XML en un objet Cv24.
     *
     * @param xml La chaîne XML à convertir en objet Cv24.
     * @return L'objet Cv24 résultant de la conversion.
     * @throws RuntimeException Si une erreur se produit lors de la conversion.
     */
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
