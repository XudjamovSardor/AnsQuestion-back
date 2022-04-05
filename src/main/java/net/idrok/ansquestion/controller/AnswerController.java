package net.idrok.ansquestion.controller;


import net.idrok.ansquestion.model.Answer;
import net.idrok.ansquestion.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/answer")
@CrossOrigin(value = "*", maxAge = 3600)
public class AnswerController {


    private final AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public List<Answer> getAll() {
        return answerService.getAll();
    }

    @PostMapping
    public Answer create(@RequestBody Answer answer) {
        return answerService.create(answer);
    }

    @PutMapping
    public Answer update(@RequestBody Answer answer) {
        return answerService.update(answer);
    }

    @DeleteMapping("/{id}")
    public void deletById(@PathVariable Long id) {
        answerService.deletById(id);
    }
}
