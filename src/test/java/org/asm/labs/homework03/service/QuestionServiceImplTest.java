package org.asm.labs.homework03.service;


import org.asm.labs.homework03.dao.QuestionDao;
import org.asm.labs.homework03.dao.QuestionDaoImpl;
import org.asm.labs.homework03.domain.Question;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class QuestionServiceImplTest {

    @Test
    public void getAll() {

        QuestionDao questionDao = mock(QuestionDaoImpl.class);
        AnswerService answerService = mock(AnswerServiceImpl.class);
        Locale locale = Locale.getDefault();
        when(questionDao.getAll(locale)).thenReturn(Collections.singletonList(
                new Question("1","Назовите год крещения Руси")));
        QuestionService questionService = new QuestionServiceImpl(questionDao, answerService);
        List<Question> questionList = questionService.getAll(locale);
        assertEquals(1, questionList.size());
        assertEquals("1", questionList.get(0).getId());
        assertEquals("Назовите год крещения Руси", questionList.get(0).getQuestion());

    }
}