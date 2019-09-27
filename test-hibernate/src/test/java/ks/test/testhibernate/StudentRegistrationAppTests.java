package ks.test.testhibernate;

import ks.test.testhibernate.model.Course;
import ks.test.testhibernate.model.Student;
import ks.test.testhibernate.services.CourseService;
import ks.test.testhibernate.services.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRegistrationAppTests {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords(){
        List<Student> students = studentService.list();
        Assert.assertEquals(students.size(),4);
        List<Course> courses = courseService.list();
        Assert.assertEquals(courses.size(),4);
    }
}
