package net.idrok.ansquestion.service;

import net.idrok.ansquestion.model.Person;
import net.idrok.ansquestion.model.Role;
import net.idrok.ansquestion.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll(String key) {
        return personRepository.findAllByFirstName(key);
    }

//    public Long countAll() {
//        return personRepository.countAll();
//    }

    public Person create(Person person) {
        if (person.getId() == null) {
            if (person.getRole() == null) person.setRole(Role.USER);
            return personRepository.save(person);
        }
        throw new RuntimeException("Id bulmasligi kerak");
    }

    public Person update(Person person) {
        if (person.getId() != null) return personRepository.save(person);
        throw new RuntimeException("Id bulishi kerak");
    }

    public void delet(Person person) {
        personRepository.delete(person);
    }

    public void deletById(Long id) {
        personRepository.deleteById(id);
    }

}
