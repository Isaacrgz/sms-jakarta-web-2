package mx.com.jakartaEE.sms.asociaciones;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.*;
import java.util.List;
import mx.com.jakartaEE.sms.domain.Person;
import mx.com.jakartaEE.sms.domain.User;
import org.apache.logging.log4j.*;



public class ClientAsociacionesJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
//      Esta parte lista de la base de datos objetos relacionados
//        List<Person> people = em.createNamedQuery("Person.findAll").getResultList();
//        
//        em.close();
//        
//        for (Person person : people) {
//            log.debug("Persona: " + person);
//            for (User user : person.getUserList())
//                log.debug("User: " + user);
//        } 

//      Esta parte crea objetos relacionados en tablas diferentes
        tx.begin();
        Person person1 = new Person("Luis", "Lopez", "ll@email.com", "2299334455");
        User user1 = new User("llopez", "123", person1);
        
//      Persistimos el objeto user 1 y en automatico se persiste el objeto person
        em.persist(user1);
        
        tx.commit();
        
        log.debug("Objeto persistido Person" + person1);
        log.debug("Objeto persistido Person" + user1);
    }
}
