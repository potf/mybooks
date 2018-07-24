import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    static EntityManagerFactory emf;
    static EntityManager em;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("mybooks");
        em = emf.createEntityManager();

        try {

          em.getTransaction().begin();

            try {

                //addOneBook("my test book", 56489.65);

                Book [] books = new Book [2];
                books[0] = new Book("Book1", 65689.3);
                books[1] = new Book("Book2", 8795.98);

                Author author = new Author("Name1", "SecondName1", "some text");

                for (Book b : books){
                    author.addBook(b);
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
