package ks.test.testhibernate.database;

import ks.test.testhibernate.model.Course;

import java.util.List;

public interface ICourseDAO  {
    List<Course> findCourseByName(String name);
}
