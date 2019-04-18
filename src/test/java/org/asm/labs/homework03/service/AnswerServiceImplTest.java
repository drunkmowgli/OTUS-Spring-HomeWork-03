package org.asm.labs.homework03.service;


import org.asm.labs.homework03.dao.AnswerDao;
import org.asm.labs.homework03.domain.Answer;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AnswerServiceImplTest {

    @MockBean
    AnswerDao answerDao;

    @Autowired
    AnswerService answerService;


    @Test
    public void getAll() {
        Mockito.when(answerDao.getAll()).thenReturn(Collections.singletonList(
                new Answer("0", "988")));
        List<Answer> answerList = answerService.getAll();
        assertEquals(1, answerList.size());
        assertEquals("0", answerList.get(0).getId());
        assertEquals("988", answerList.get(0).getAnswer());

    }

    @Test
    public void isCorrectAnswer() {
        String questionId = "0";
        String personAnswer = "иЗя";
        when(answerDao.getAll()).thenReturn(Collections.singletonList(
                new Answer("0", "Изя")
        ));
        assertTrue(answerService.isCorrectAnswer(questionId, personAnswer));

    }
}