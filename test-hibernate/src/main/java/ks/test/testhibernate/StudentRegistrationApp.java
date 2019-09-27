package ks.test.testhibernate;

import ks.test.testhibernate.model.Course;
import ks.test.testhibernate.model.Student;
import ks.test.testhibernate.repo.CourseRepository;
import ks.test.testhibernate.repo.StudentRepository;
import ks.test.testhibernate.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRegistrationApp implements Runnable {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseService courseService;

    public static void main(String[] args) {
        SpringApplication.run(StudentRegistrationApp.class, args);
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Testing ");
        Student s1 = new Student("Arvind");

        long id = courseService.list().get(1).getCid();



    }
}
