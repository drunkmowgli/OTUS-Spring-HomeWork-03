package org.asm.labs.homework03.domain;

/***
 * The <code>Answer</code> class contains several useful class field
 * and methods. This class describe answer.
 *
 * @author Yuriy Maslov
 */
public class Answer {

    private final String answer;

    private final String id;

    /**
     * Constructs an empty <tt>Answer</tt> with the answer.
     *
     * @param answer the name
     * @param id     the answer's id
     */
    public Answer(String id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    /**
     * Returns the value to which the specified answer.
     *
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Returns the value to which the specified answer's id.
     *
     * @return the answer's id
     */
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answer='" + answer + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
