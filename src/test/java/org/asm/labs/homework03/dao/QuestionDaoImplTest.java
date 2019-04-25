package org.asm.labs.homework03.dao;


import org.asm.labs.homework03.domain.Question;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
public class QuestionDaoImplTest {

    @SpyBean
    QuestionDao questionDao;


    @Test
    public void getAll() {
        Locale locale = Locale.getDefault();
        List<Question> questionList = questionDao.getAll(locale);
        assertEquals(2, questionList.size());
        assertEquals("0", questionList.get(0).getId());
        assertEquals("Name the year of the baptism of Rus", questionList.get(0).getQuestion());
    }

}