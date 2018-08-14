package com.mybook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ganre")
public class Ganre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String name;

    public Ganre() {
    }

    public void Ganre(){}

    public Ganre(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "ganres", cascade = CascadeType.ALL)
    List<Book> books = new ArrayList<Book>();
}
