package org.asm.labs.homework03.dao;


import org.asm.labs.homework03.domain.Question;

import java.util.List;
import java.util.Locale;

/**
 * @author Yuriy Maslov
 */

public interface QuestionDao {

    /**
     * Returns the List of the Questions.
     *
     * @return the List of the Questions
     */
    List<Question> getAll(Locale locale);

}
