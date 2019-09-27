package ks.test.testhibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,
                       CascadeType.MERGE
            })
    @JoinTable(name="student_course",
                joinColumns = {@JoinColumn(name="id")},
                inverseJoinColumns = {@JoinColumn(name="cid")})
    private Set<Course> studentregistrations = new HashSet<>();

    public Student(){}

    public Student(String sname){
        this.name = sname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



}
