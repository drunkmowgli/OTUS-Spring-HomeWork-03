package org.asm.labs.homework03.dao;


import org.asm.labs.homework03.domain.Person;

/**
 * @author Yuriy Maslov
 */

public interface PersonDao {

    /**
     * Returns the Person by the Name.
     *
     * @param name - Name of Person
     * @return Person
     */

    Person findByName(String name);

}
