package net.idrok.ansquestion.model;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String questionString;

    private String questionPhoto;

    @ManyToOne
    private Person person;

    @Column(name = "class", nullable = true)
    private Class aClass;



    private LocalDate questionDate;

    private QuestionLevl questionLevl;

    @ManyToOne
    private Subject subject;


    public Question() {}

    public Question(Long id, String questionString, String questionPhoto, Person person, Class aClass, LocalDate questionDate, QuestionLevl questionLevl, Subject subject) {
        this.id = id;
        this.questionString = questionString;
        this.questionPhoto = questionPhoto;
        this.person = person;
        this.aClass = aClass;
        this.questionDate = questionDate;
        this.questionLevl = questionLevl;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    public String getQuestionPhoto() {
        return questionPhoto;
    }

    public void setQuestionPhoto(String questionPhoto) {
        this.questionPhoto = questionPhoto;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public LocalDate getQuestionDate() {
        return questionDate;
    }

    public void setQuestionDate(LocalDate questionDate) {
        this.questionDate = questionDate;
    }

    public QuestionLevl getQuestionLevl() {
        return questionLevl;
    }

    public void setQuestionLevl(QuestionLevl questionLevl) {
        this.questionLevl = questionLevl;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
