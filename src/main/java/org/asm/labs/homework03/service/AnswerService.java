package org.asm.labs.homework03.service;



import org.asm.labs.homework03.domain.Answer;

import java.util.List;

/**
 * @author Yuriy Maslov
 */

public interface AnswerService {

    /**
     * Returns the List of Answers.
     *
     * @return the List of Answers
     */
    List<Answer> getAll();

    /**
     * Returns <code>true</code> if the person's answer is a correct answer.
     *
     * @param questionId   id of the question
     * @param personAnswer person's answer
     * @return <code>true</code> if the person's answer is a correct answer;
     * <code>false</code> otherwise
     */

    boolean isCorrectAnswer(String questionId, String personAnswer);

}
