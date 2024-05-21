package fr.univrouen.cv24v2.transformer;

import fr.univrouen.cv24v2.model.CvList;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;
/**
 * Cette classe fournit une méthode statique pour convertir un objet CvList en une représentation XML.
 */
public class TransformerListCVToXML {
    /**
     * Convertit un objet CvList en une représentation XML.
     *
     * @param cvsXml L'objet CvList à convertir en XML.
     * @return Une chaîne représentant l'objet CvList au format XML.
     * @throws RuntimeException Si une erreur se produit lors de la conversion.
     */
    public static String convertToXml(CvList cvsXml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CvList.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // Formatage XML

            StringWriter stringWriter = new StringWriter();
            marshaller.marshal(cvsXml, stringWriter);

            return stringWriter.toString();
        } catch (JAXBException e) {
            throw new RuntimeException("Erreur conversion List Cv vers XML", e);
        }

    }

}
