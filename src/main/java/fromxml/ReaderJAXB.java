package fromxml;

import com.mybook.Book;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ReaderJAXB {

    public static List bookList(String filePath){

        List<Book> bookList = new ArrayList<Book>();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CatalogJAXB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            CatalogJAXB catalogJAXB = (CatalogJAXB) unmarshaller.unmarshal(new File(filePath));

            bookList = catalogJAXB.BookList();


        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
