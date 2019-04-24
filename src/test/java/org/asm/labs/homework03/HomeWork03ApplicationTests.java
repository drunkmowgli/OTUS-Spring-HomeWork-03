package org.asm.labs.homework03;

import org.asm.labs.homework03.service.AnswerServiceImplTest;
import org.asm.labs.homework03.service.QuestionServiceImplTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@Suite.SuiteClasses(value = {
        AnswerServiceImplTest.class,
        QuestionServiceImplTest.class,
        AnswerServiceImplTest.class,
        QuestionServiceImplTest.class,
})
@SpringBootTest
public class HomeWork03ApplicationTests {

    @Test
    public void contextLoads() {
    }

}
