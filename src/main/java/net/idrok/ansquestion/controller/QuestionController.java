package net.idrok.ansquestion.controller;

import net.idrok.ansquestion.model.Question;
import net.idrok.ansquestion.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/question")
@CrossOrigin(value = "*", maxAge = 3600)
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAll() {
        return questionService.getAll();
    }

    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    @PutMapping
    public Question update(@RequestBody Question question) {
        return questionService.update(question);
    }

    @DeleteMapping("/{id}")
    public void delectById(@PathVariable Long id) {
        questionService.deletById(id);
    }
}
