import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String secondName;
    private String description;

    public Author() {}

    public Author(String name, String secondName, String description) {
        this.name = name;
        this.secondName = secondName;
        this.description = description;
    }

    @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
    List<Book> books = new ArrayList<Book>();

    public void addBook(Book book){
        if (!books.contains(books))
            books.add(book);
        if (!book.authors.contains(book))
            book.authors.add(this);
    }
}
