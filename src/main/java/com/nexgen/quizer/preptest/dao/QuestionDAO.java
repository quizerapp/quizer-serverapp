package com.nexgen.quizer.preptest.dao;

import java.util.List;

import com.nexgen.quizer.preptest.domain.Question;

public interface QuestionDAO {

	Question addQuestion(Question question, String testId);

	List<Question> getQuestions(String testId);
}
