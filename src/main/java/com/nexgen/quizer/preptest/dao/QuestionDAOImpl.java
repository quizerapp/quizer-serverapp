package com.nexgen.quizer.preptest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nexgen.quizer.preptest.domain.Question;
import com.nexgen.quizer.preptest.repo.QuestionRepo;

@Repository
public class QuestionDAOImpl implements QuestionDAO {

	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question addQuestion(Question question, String testId) {
		return questionRepo.save(question);
	}

	@Override
	public List<Question> getQuestions(String testId) {
		return null;
	}

}
