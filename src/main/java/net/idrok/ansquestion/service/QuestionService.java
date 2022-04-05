package net.idrok.ansquestion.service;

import net.idrok.ansquestion.model.Question;
import net.idrok.ansquestion.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    public Question create(Question question) {
        if (question.getId() == null) return questionRepository.save(question);
        throw new RuntimeException("id kerak emas");
    }

    public Question update(Question question) {
        if (question.getId() != null) return  questionRepository.save(question);
        throw new RuntimeException("Id kerak");
    }

    public void delet(Question question) {
        questionRepository.delete(question);
    }

    public void deletById(Long id) {
        questionRepository.deleteById(id);
    }
}
