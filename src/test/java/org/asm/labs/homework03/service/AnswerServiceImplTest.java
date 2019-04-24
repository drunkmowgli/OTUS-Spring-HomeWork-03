package org.asm.labs.homework03.service;


import org.asm.labs.homework03.dao.AnswerDao;
import org.asm.labs.homework03.domain.Answer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
public class AnswerServiceImplTest {

    @SpyBean
    AnswerDao answerDao;

    @SpyBean
    AnswerService answerService;


    @Test
    public void getAll() {
        List<Answer> answerList = answerService.getAll();
        assertEquals(2, answerList.size());
        assertEquals("0", answerList.get(0).getId());
        assertEquals("988", answerList.get(0).getAnswer());

    }

    @Test
    public void isCorrectAnswer() {
        String questionId = "0";
        String personAnswer = "988";
        assertTrue(answerService.isCorrectAnswer(questionId, personAnswer));

    }
}