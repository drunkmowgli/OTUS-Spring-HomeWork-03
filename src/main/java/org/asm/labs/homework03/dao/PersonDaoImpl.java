package org.asm.labs.homework03.dao;

import org.asm.labs.homework03.domain.Person;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

    public Person findByName(String name) {
        return new Person(name);
    }
}
