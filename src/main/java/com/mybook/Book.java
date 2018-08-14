package com.mybook;

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
    private String description;

    public Book() {
    }

    public Book(String name, String originalName, String series, int year, String translator, int pages, String isImg, double price, String description) {
        this.name = name;
        this.originalName = originalName;
        this.series = series;
        this.year = year;
        this.translator = translator;
        this.pages = pages;
        this.isImg = isImg;
        this.price = price;
        this.description = description;
    }

    @ManyToMany
    @JoinTable(
            name = "book_author",
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


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", originalName='" + originalName + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                ", translator='" + translator + '\'' +
                ", pages=" + pages +
                ", isImg='" + isImg + '\'' +
                ", price=" + price +
                '}';
    }
}
