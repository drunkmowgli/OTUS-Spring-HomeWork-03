package org.asm.labs.homework03.dao;


import org.asm.labs.homework03.domain.Answer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
public class AnswerDaoImplTest {

    @SpyBean
    AnswerDao answerDao;

    @Test
    public void getAll() {
        List<Answer> answerList = answerDao.getAll();
        assertEquals(2, answerList.size());
        assertEquals("0", answerList.get(0).getId());
        assertEquals("988", answerList.get(0).getAnswer());
    }
}