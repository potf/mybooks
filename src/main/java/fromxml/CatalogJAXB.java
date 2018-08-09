package fromxml;

import com.mybook.Book;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "catalog")
public class CatalogJAXB {

    @XmlElement(name = "book")
    List<BookJAXB> list = new ArrayList<BookJAXB>();



    public List BookList(){
        List<Book> bookList = new ArrayList<Book>();

        for (BookJAXB bookJAXB : list){
            bookList.add(new Book(bookJAXB.getName(), bookJAXB.getPrice()));
        }

        return bookList;
    }

    public void print() {
        for (BookJAXB b : list) {
            System.out.println(b.toString());
        }
    }
}
