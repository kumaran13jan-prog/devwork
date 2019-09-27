package ks.test.testhibernate.services;

import ks.test.testhibernate.database.IDao;
import ks.test.testhibernate.model.Course;
import ks.test.testhibernate.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    //Standard Method
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> list(){
        return courseRepository.findAll();
    }

    //Generic Dao
    IDao<Course> courseIDao;

    @Autowired
    public void setDao( IDao<Course> ds){
        courseIDao = ds;
    }

}
