package org.asm.labs.homework03.domain;

/***
 * The <code>Question</code> class contains several useful class field
 * and methods. This class describes question.
 *
 * @author Yuriy Maslov
 */
public class Question {

    private final String id;

    private final String question;

    /**
     * Constructs an empty <tt>Question</tt> with the question.
     *
     * @param question the name
     * @param id the question's id
     */
    public Question(String id, String question) {
        this.id = id;
        this.question = question;
    }

    /**
     * Returns the value to which the specified the question.
     *
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Returns the value to which the specified the question's id.
     *
     * @return the question's id
     */
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
