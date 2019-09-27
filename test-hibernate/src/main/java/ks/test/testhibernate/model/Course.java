package ks.test.testhibernate.model;

import org.hibernate.annotations.Sort;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue
    private long cid;
    private String coursename;

    @ManyToMany(fetch= FetchType.LAZY,
                cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
                },
                mappedBy = "studentregistrations")
    private Set<Student> studentSet = new HashSet<>();

    @OrderBy
    Set<Course> sortedCourse = new HashSet<>();

    public Course(){}
    public Course(String cname){
        this.coursename = cname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }
}
