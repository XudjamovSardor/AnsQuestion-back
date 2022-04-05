package net.idrok.ansquestion.service;

import net.idrok.ansquestion.model.Person;
import net.idrok.ansquestion.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person create(Person person) throws RuntimeException {
        if (person.getId() == null) return personRepository.save(person);
        throw new RuntimeException("Id bulmasligi kerak");
    }

    public Person update(Person person) throws RuntimeException {
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
