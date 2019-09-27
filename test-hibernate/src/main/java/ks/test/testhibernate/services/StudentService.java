package ks.test.testhibernate.services;

import ks.test.testhibernate.database.IDao;
import ks.test.testhibernate.model.Course;
import ks.test.testhibernate.model.Student;
import ks.test.testhibernate.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> list(){
        return studentRepository.findAll();
    }

    public List<Student> sortedList() {
        List<Student> students= studentRepository.findAll();
        return  students;
    }

    //Generic Dao
    IDao<Student> studentIDao;

    @Autowired
    public void setDao( IDao<Student> ds){
        studentIDao = ds;
    }



}
