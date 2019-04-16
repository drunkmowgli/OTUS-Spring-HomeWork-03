package org.asm.labs.homework03.domain;

/***
 * The <code>Person</code> class contains several useful class field
 * and methods. This class describe person.
 *
 * @author Yuriy Maslov
 */
public class Person {

    private final String name;

    /**
     * Constructs an empty <tt>Person</tt> with the name.
     *
     * @param name the name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Returns the value to which the specified person is name.
     *
     * @return the name of the Person
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
