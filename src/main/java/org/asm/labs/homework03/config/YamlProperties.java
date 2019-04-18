package org.asm.labs.homework03.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class describe application's files configuration (file name).
 */

@Component
@ConfigurationProperties(prefix = "files")
public class YamlProperties {

    /**
     * Name of file with questions on Russian Language
     */
    private String ruQuestions;

    /**
     * Name of file with questions on English Language
     */
    private String enQuestions;

    /**
     * Name of file with answers
     */
    private String answers;

    public String getRuQuestions() {
        return ruQuestions;
    }

    public String getEnQuestions() {
        return enQuestions;
    }

    public String getAnswers() {
        return answers;
    }


    public void setRuQuestions(String ruQuestions) {
        this.ruQuestions = ruQuestions;
    }

    public void setEnQuestions(String enQuestions) {
        this.enQuestions = enQuestions;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
