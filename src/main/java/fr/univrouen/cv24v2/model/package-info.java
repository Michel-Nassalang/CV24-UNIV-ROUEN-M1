@XmlSchema(
        xmlns = {
                @XmlNs(prefix = "cv24", namespaceURI = "http://univ.fr/cv24"),
                @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
        },
        location = "http://univ.fr/cv24 cv24.tp1.xsd"
)
package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlSchema;