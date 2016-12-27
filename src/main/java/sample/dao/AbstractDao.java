package sample.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Yves on 12/21/2016.
 */
@Repository
public abstract class AbstractDao<PK extends Serializable, T extends Serializable> {

    private final Class<T> persistentClass;

    @Autowired
    private SessionFactory sessionFactory;

    protected AbstractDao(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<T> listAll(){
        return getSession().createQuery("FROM " + persistentClass.getName()).list();
    }

    public T getById(PK key){
        return (T) getSession().get(persistentClass, key);
    }

    public void persist(T entity){
        getSession().persist(entity);
    }

    public void delete(T entity){
        getSession().delete(entity);
    }

}
