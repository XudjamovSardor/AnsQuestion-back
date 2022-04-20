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
    private String QuestionString;

    private File QuestionPhoto;

    @ManyToOne
    private Person person;

    @Column(name = "class")
    private Class aClass;

    private SubjectLevl subjectLevl;

    private LocalDate QuestionDate;

    private QuestionLevl questionLevl;


    public Question() {}

    public Question(Long id, String questionString, File questionPhoto, Person person, Class aClass, SubjectLevl subjectLevl, LocalDate questionDate, QuestionLevl questionLevl) {
        this.id = id;
        QuestionString = questionString;
        QuestionPhoto = questionPhoto;
        this.person = person;
        this.aClass = aClass;
        this.subjectLevl = subjectLevl;
        QuestionDate = questionDate;
        this.questionLevl = questionLevl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionString() {
        return QuestionString;
    }

    public void setQuestionString(String questionString) {
        QuestionString = questionString;
    }

    public File getQuestionPhoto() {
        return QuestionPhoto;
    }

    public void setQuestionPhoto(File questionPhoto) {
        QuestionPhoto = questionPhoto;
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

    public SubjectLevl getSubjectLevl() {
        return subjectLevl;
    }

    public void setSubjectLevl(SubjectLevl subjectLevl) {
        this.subjectLevl = subjectLevl;
    }

    public LocalDate getQuestionDate() {
        return QuestionDate;
    }

    public void setQuestionDate(LocalDate questionDate) {
        QuestionDate = questionDate;
    }

    public QuestionLevl getQuestionLevl() {
        return questionLevl;
    }

    public void setQuestionLevl(QuestionLevl questionLevl) {
        this.questionLevl = questionLevl;
    }
}
