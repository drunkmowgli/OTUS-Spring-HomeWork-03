package org.asm.labs.homework03.service;


import org.asm.labs.homework03.dao.AnswerDao;
import org.asm.labs.homework03.dao.AnswerDaoImpl;
import org.asm.labs.homework03.domain.Answer;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerServiceImplTest {

    @Test
    public void getAll() {

        AnswerDao answerDao = mock(AnswerDaoImpl.class);
        when(answerDao.getAll()).thenReturn(Collections.singletonList(
                new Answer("0", "988")));
        AnswerService answerService = new AnswerServiceImpl(answerDao);
        List<Answer> answerList = answerService.getAll();
        assertEquals(1, answerList.size());
        assertEquals("0", answerList.get(0).getId());
        assertEquals("988", answerList.get(0).getAnswer());

    }

    @Test
    public void isCorrectAnswer() {
        String questionId = "0";
        String personAnswer = "иЗя";
        AnswerDao answerDao = mock(AnswerDaoImpl.class);
        when(answerDao.getAll()).thenReturn(Collections.singletonList(
                new Answer("0", "Изя")
        ));
        AnswerService answerService = new AnswerServiceImpl(answerDao);
        assertTrue(answerService.isCorrectAnswer(questionId, personAnswer));

    }
}