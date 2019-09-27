package ks.test.testhibernate.database;

import ks.test.testhibernate.model.Course;

import java.io.Serializable;
import java.util.List;

public interface IDao<T extends Serializable> {
    List<T> findByName(String name);
    List<T> findById(Long Id);
    void add(final T entity);
    T update(final T entity);
    void delete(final T entity);
    void deleteById(final long entityId);

}
