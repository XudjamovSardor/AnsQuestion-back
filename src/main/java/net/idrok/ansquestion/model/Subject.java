package net.idrok.ansquestion.model;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private SubjectLevl subjectLevl;

    @Column(length = 1000)
    private String info;

    public Subject() {}

    public Subject(Long id, String name, SubjectLevl subjectLevl, String info) {
        this.id = id;
        this.name = name;
        this.subjectLevl = subjectLevl;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubjectLevl getSubjectLevl() {
        return subjectLevl;
    }

    public void setSubjectLevl(SubjectLevl subjectLevl) {
        this.subjectLevl = subjectLevl;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
