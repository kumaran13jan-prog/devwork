package ks.test.testhibernate.repo;

import ks.test.testhibernate.database.AbstractTemplatedDAO;
import ks.test.testhibernate.database.IDao;
import org.hibernate.Transaction;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TemplateDAO<T extends Serializable> extends AbstractTemplatedDAO implements IDao<T> {

    @Override
    public List<T> findByName(String name) {
        return null;
    }

    @Override
    public List<T> findById(Long Id) {
        return null;
    }

    @Override
    public void add(T entity) {
        Transaction t = getCurrentSession().getTransaction();
        t.begin();

        t.commit();

    }

}
