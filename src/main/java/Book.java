import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    //private String originalName;
    //private String author;
    //private String publisher;
    //private String series;
    //private int year;
    //private String trranslator;
    //private int pages;
    //private char isImg;

    public Book() {}

    public Book(String name){
        this.name = name;
    }

}
