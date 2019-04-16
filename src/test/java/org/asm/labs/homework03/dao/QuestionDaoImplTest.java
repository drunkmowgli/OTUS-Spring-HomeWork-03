package org.asm.labs.homework03.dao;


import org.asm.labs.homework03.config.YamlProperties;
import org.asm.labs.homework03.domain.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
@EnableConfigurationProperties(YamlProperties.class)
public class QuestionDaoImplTest {

    @Autowired
    YamlProperties yamlProperties;

    @Autowired
    QuestionDao questionDao;

    @Test
    public void getAll() {
        Locale locale = Locale.getDefault();
        List<Question> questionList = questionDao.getAll(locale);
        assertEquals(2, questionList.size());
        assertEquals("0", questionList.get(0).getId());
        assertEquals("Назовите год крещения Руси", questionList.get(0).getQuestion());
    }

}