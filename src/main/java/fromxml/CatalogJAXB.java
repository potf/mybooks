package fromxml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "catalog")
public class CatalogJAXB {

    @XmlElement(name = "book")
    List<BookJAXB> list = new ArrayList<BookJAXB>();

    public void print() {
        for (BookJAXB b : list) {
            System.out.println(b.toString());
        }
    }
}
