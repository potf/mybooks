import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    static EntityManagerFactory emf;
    static EntityManager em;

    public static void main(String[] args) {


        try {

            emf = Persistence.createEntityManagerFactory("mybooks");
            em = emf.createEntityManager();

            try {

                addBook("booktest2", 56489.65);

            } finally {
                em.close();
                emf.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addBook(String name, double price) {

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
