package org.asm.labs.homework03.service;


import org.asm.labs.homework03.domain.Question;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * @author Yuriy Maslov
 */
public interface QuestionService {

    /**
     * Returns List of Questions.
     *
     * @return List of Questions
     */
    List<Question> getAll(Locale locale);

    /**
     * Returns <int>count</int> of correct person's answers.
     *
     * @param personAnswerMap - Person's answers
     * @return <int>count</int> of correct person's answers
     */

    int countCorrectAnswer(Map<String, String> personAnswerMap);

}
