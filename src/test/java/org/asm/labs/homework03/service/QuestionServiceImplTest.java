package org.asm.labs.homework03.service;


import org.asm.labs.homework03.dao.QuestionDao;
import org.asm.labs.homework03.domain.Question;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class QuestionServiceImplTest {

    @MockBean
    QuestionDao questionDao;

    @MockBean
    AnswerService answerService;

    @Autowired
    QuestionService questionService;

    @Test
    public void getAll() {
        Locale locale = Locale.getDefault();
        Mockito.when(questionDao.getAll(locale)).thenReturn(Collections.singletonList(
                new Question("1", "Назовите год крещения Руси")));
        List<Question> questionList = questionService.getAll(locale);
        assertEquals(1, questionList.size());
        assertEquals("1", questionList.get(0).getId());
        assertEquals("Назовите год крещения Руси", questionList.get(0).getQuestion());

    }
}