package com.epam.project.service;

import com.epam.project.entity.Person;

import java.util.List;

public interface PersonService {

    Person findById(long id);

    List<Person> findAll();

    void update(Person person);

    Person findByMail(String eMail);
}
