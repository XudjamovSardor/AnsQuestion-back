package net.idrok.ansquestion.controller;

import net.idrok.ansquestion.model.Subject;
import net.idrok.ansquestion.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subject")
@CrossOrigin(value = "*", maxAge = 3600)
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getAll() {
        return subjectService.getAll();
    }

    @PostMapping
    public Subject create(@RequestBody Subject subject) {
        return subjectService.create(subject);
    }

    @PutMapping
    public Subject update(@RequestBody Subject subject) {
        return subjectService.update(subject);
    }

    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id) {
        subjectService.deletById(id);
    }
}
