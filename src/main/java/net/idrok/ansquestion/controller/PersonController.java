package net.idrok.ansquestion.controller;

import net.idrok.ansquestion.model.Person;
import net.idrok.ansquestion.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAll();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.create(person);
    }

    @PutMapping
    public  Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id) {
        personService.deletById(id);
    }
}
