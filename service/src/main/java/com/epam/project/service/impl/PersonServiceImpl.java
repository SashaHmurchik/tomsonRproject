package com.epam.project.service.impl;

import com.epam.project.dao.PersonDao;
import com.epam.project.entity.Person;
import com.epam.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person findById(long id) {
        return null;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public void update(Person person) {

    }

    @Override
    @Transactional(readOnly = true)
    public Person findByMail(String eMail) {
        return personDao.findByMail(eMail);
    }
}
