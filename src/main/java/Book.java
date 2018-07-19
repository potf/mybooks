import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String originalName;
    private String series;
    private int year;
    private String translator;
    private int pages;
    private String isImg;
    private double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @ManyToMany
    @JoinTable(
            name = "book_authors",
            joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id")})
    List<Author> authors = new ArrayList<Author>();

    public void addAuthors(Author author) {
        if (!authors.contains(author))
            authors.add(author);
        if (!author.books.contains(author))
            author.books.add(this);
    }

    @ManyToMany
    @JoinTable(name = "book_ganre",
            joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "ganre_id", referencedColumnName = "id")})
    List<Ganre> ganres = new ArrayList<Ganre>();

    public void addGanre(Ganre ganre) {
        if (!ganres.contains(ganre))
            ganres.add(ganre);
        if (!ganre.books.contains(ganre))
            ganre.books.add(this);
    }

}
