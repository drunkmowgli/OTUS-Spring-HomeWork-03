package org.asm.labs.homework03.shell;

import org.asm.labs.homework03.service.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@ShellComponent
public class ShellCommand {

    private final Exam exam;

    @Autowired
    public ShellCommand(Exam exam) {
        this.exam = exam;
    }

    @ShellMethod("Start exam for user with locale")
    public void exam(@ShellOption String name, String userLocale) {
        exam.startExam(name, userLocale);
    }

}
