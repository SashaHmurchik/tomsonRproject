package com.epam.project.controller;

import com.epam.project.PersonModel;
import com.epam.project.controller.converter.ConvertPerson;
import com.epam.project.entity.Person;
import com.epam.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Consumes("application/json")
@Produces("application/json")
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping
    public List<PersonModel> findAll() {
        List<Person> persons = personService.findAll();
        return persons.stream().map(ConvertPerson::convertToPersonModel)
                .collect(Collectors.toList());
    }
}
