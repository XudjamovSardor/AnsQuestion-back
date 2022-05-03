package net.idrok.ansquestion.service;


import net.idrok.ansquestion.model.Subject;
import net.idrok.ansquestion.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getAll(String key) {
        return subjectRepository.findAllByName(key);
    }

    public Subject create(Subject subject) {
        if (subject.getId() == null) return subjectRepository.save(subject);
        throw new RuntimeException("Id kerak emas");
    }

    public Subject update(Subject subject) {
        if (subject.getId() != null) return subjectRepository.save(subject);
        throw new RuntimeException("Id kerak");
    }

    public void delet(Subject subject) {
        subjectRepository.delete(subject);
    }

    public void deletById(Long id) {
        subjectRepository.deleteById(id);
    }
}

