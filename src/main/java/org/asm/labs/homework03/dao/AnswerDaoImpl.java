package org.asm.labs.homework03.dao;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.asm.labs.homework03.config.YamlProperties;
import org.asm.labs.homework03.domain.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository("answerDao")
public class AnswerDaoImpl implements AnswerDao {

    private String answers;

    @Autowired
    public AnswerDaoImpl(YamlProperties yamlProperties) {
        this.answers = yamlProperties.getAnswers();
    }

    public List<Answer> getAll() {
        ClassLoader classLoader = getClass().getClassLoader();
        String file = Objects.requireNonNull(classLoader.getResource(answers)).getFile();
        List<Answer> answerList = new ArrayList<>();

        try (Reader reader = Files.newBufferedReader(Paths.get(file))) {
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());

            for (CSVRecord csvRecord :
                    csvParser) {
                String answerString = csvRecord.get("Answer");
                String answerId = csvRecord.get("№");
                Answer answer = new Answer(answerId, answerString);
                answerList.add(answer);
            }
            return answerList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
