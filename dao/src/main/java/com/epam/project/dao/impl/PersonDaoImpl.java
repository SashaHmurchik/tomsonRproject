package com.epam.project.dao.impl;

import com.epam.project.dao.PersonDao;
import com.epam.project.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Person activity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(activity);
    }

    @Override
    public Person findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Person.class, id);
    }

    @Override
    public List<Person> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Person", Person.class).list();

    }

    @Override
    public void update(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.update(person);
    }

    @Override
    public void delete(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(person);
    }

    @Override
    public Person findByMail(String eMail) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Person.class, eMail);
    }
}
