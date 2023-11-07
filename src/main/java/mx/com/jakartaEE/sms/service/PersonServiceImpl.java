package mx.com.jakartaEE.sms.service;

import jakarta.ejb.Stateless;
import java.util.List;
import mx.com.jakartaEE.sms.data.PersonDao;
import mx.com.jakartaEE.sms.domain.Person;
import jakarta.inject.Inject;

@Stateless
public class PersonServiceImpl implements PersonServiceRemote, PersonServiceLocal {

    @Inject
    private PersonDao personDao;
    
    @Override
    public List<Person> listPerson() {
        
        return personDao.findAllPeople();
    }

    @Override
    public Person findPersonById(Person person) {
        return personDao.findPersonById(person);
    }

    @Override
    public Person findPersonByEmail(Person person) {
        return personDao.findPersonByEmail(person);
    }

    @Override
    public void addPerson(Person person) {
        personDao.insertPerson(person);
    }

    @Override
    public void modifyPerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    public void deletePerson(Person person) {
        personDao.deletePerson(person);
    }
    
}
