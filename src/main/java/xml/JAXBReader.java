package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBReader {

    public static void getmain(String filePath) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CatalogJAXB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            CatalogJAXB catalogJAXB = (CatalogJAXB) unmarshaller.unmarshal(new File(filePath));

            catalogJAXB.print();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
