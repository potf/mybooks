package com.mybook;

import fromxml.ReaderJAXB;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    static EntityManagerFactory emf;
    static EntityManager em;


    public static void main(String[] args) {

        List<Book> l = ReaderJAXB.bookList("/home/roman/IdeaProjects/mybooks/src/main/resources/new_books.xml");

        emf = Persistence.createEntityManagerFactory("mybooks");
        em = emf.createEntityManager();

        try {

          em.getTransaction().begin();

            try {

                Author author = new Author("roman", "miroshnychenko", "yo");

                for (Book book : l){
                    author.addBook(book);
                }

                em.persist(author);
                em.getTransaction().commit();


            } finally {
                em.close();
                emf.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
