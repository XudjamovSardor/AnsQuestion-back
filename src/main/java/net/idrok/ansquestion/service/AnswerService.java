package net.idrok.ansquestion.service;

import net.idrok.ansquestion.model.Answer;
import net.idrok.ansquestion.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public List<Answer> getAll() {
        return answerRepository.findAll();
    }

    public Answer create(Answer answer) {
        if (answer.getId() == null) return answerRepository.save(answer);
        throw new RuntimeException("Id bulmaslogi kerak");
    }

    public Answer update(Answer answer) {
        if (answer.getId() != null) return answerRepository.save(answer);
        throw new RuntimeException("id bulishi kerak");
    }

    public void delet(Answer answer) {
        answerRepository.delete(answer);
    }

    public void deletById(Long id) {
        answerRepository.deleteById(id);
    }
}
