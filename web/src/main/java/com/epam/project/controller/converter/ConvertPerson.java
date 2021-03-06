package com.epam.project.controller.converter;

import com.epam.project.PersonModel;
import com.epam.project.RoleModel;
import com.epam.project.entity.Person;
import com.epam.project.entity.Role;

public class ConvertPerson {
    public static PersonModel convertToPersonModel(Person person) {
        PersonModel personModel = new PersonModel();
        personModel.setId(person.getId());
        personModel.setEMail(person.getEMail());
        personModel.setUserRole(convertToRoleModel(person.getUserRole()));
        return personModel;
    }

    public static Person convertToPerson(PersonModel personModel) {
        Person person = new Person();
        person.setId(personModel.getId());
        person.setEMail(personModel.getEMail());
        person.setUserRole(convertToRole(personModel.getUserRole()));
        return person;

    }

    public static RoleModel convertToRoleModel(Role role) {
        RoleModel roleModel = new RoleModel();
        roleModel.setId(role.getId());
        roleModel.setRoleName(role.getRoleName());
        return roleModel;
    }

    public static Role convertToRole(RoleModel roleModel) {
        Role role = new Role();
        role.setId(roleModel.getId());
        role.setRoleName(roleModel.getRoleName());
        return role;
    }
}
