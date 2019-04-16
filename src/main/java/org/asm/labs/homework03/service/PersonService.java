package org.asm.labs.homework03.service;


import org.asm.labs.homework03.domain.Person;

/**
 * @author Yuriy Maslov
 */
public interface PersonService {

    /**
     * Returns Person by Name.
     *
     * @param name Person's name
     * @return Person
     */
    Person getByName(String name);

}
