package org.asm.labs.homework03;

import org.asm.labs.homework03.service.Exam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HomeWork03Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(HomeWork03Application.class, args);
		Exam exam = applicationContext.getBean(Exam.class);
		exam.startExam();
	}

}
