package net.idrok.ansquestion.model;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String answerString;

    private File answerFile;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Question question;

    private LocalDate answerDate;

    public Answer() {}

    public Answer(Long id, String answerString, File answerFile, Person person, Question question, LocalDate answerDate) {
        this.id = id;
        this.answerString = answerString;
        this.answerFile = answerFile;
        this.person = person;
        this.question = question;
        this.answerDate = answerDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerString() {
        return answerString;
    }

    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }

    public File getAnswerFile() {
        return answerFile;
    }

    public void setAnswerFile(File answerFile) {
        this.answerFile = answerFile;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public LocalDate getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(LocalDate answerDate) {
        this.answerDate = answerDate;
    }
}
