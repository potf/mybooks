package com.mybook;

import fromxml.JAXBReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static EntityManagerFactory emf;
    static EntityManager em;


    public static void main(String[] args) {


        //JAXBReader.getmain("/home/roman/IdeaProjects/mybooks/src/main/resources/new_books.xml");
        List<Book> l = JAXBReader.bookList("/home/roman/IdeaProjects/mybooks/src/main/resources/new_books.xml");
        List<Book> boo = new ArrayList<Book>();


        for (Book b : l){
            boo.add(b);
        }
        System.out.println(l.size());


        /*
        emf = Persistence.createEntityManagerFactory("mybooks");
        em = emf.createEntityManager();

        try {

          em.getTransaction().begin();

            try {


            } finally {
                em.close();
                emf.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    private static void addOneBook(String name, double price) {

        em.getTransaction().begin();

        try {
            Book book = new Book(name, price);

            em.persist(book);
            em.getTransaction().commit();

        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

}
