package ks.test.testhibernate.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

// Alternative method to use for any type Entity
public abstract class AbstractTemplatedDAO<T extends Serializable> {

    private Class<T> tClass;

    @Autowired
    private SessionFactory sessionFactory;

    public void settClass(Class<T> clstoSet){
        tClass=clstoSet;
    }

    public T findById(long id){
        return(T) sessionFactory.getCurrentSession().get(tClass,id);
    }

    public List<T> findAll(){
        return sessionFactory.getCurrentSession().createQuery("from " + tClass.getName()).list();
    }

    public void save(T entity) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        sessionFactory.getCurrentSession().persist( entity );
        t.commit();
    }

    public T update(T entity) {

        return (T) sessionFactory.getCurrentSession().merge( entity );
    }

    public void delete(T entity) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();
        sessionFactory.getCurrentSession().delete( entity );
        t.commit();
    }
    public void deleteById(long id) {
        final T entity = findById( id);
        delete( entity );
    }

    protected final Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
