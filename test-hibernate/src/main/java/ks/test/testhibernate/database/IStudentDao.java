package ks.test.testhibernate.database;

import ks.test.testhibernate.model.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> findStudentByName(String name);

}
