package com.nexgen.quizer.preptest.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.nexgen.quizer.preptest.dao.QuestionDAO;
import com.nexgen.quizer.preptest.domain.Question;
import com.nexgen.quizer.preptest.dto.QuestionDTO;

@Service
public class QuestionServiceImpl implements QuestionService {

	private static final Logger log = LoggerFactory.getLogger(QuestionServiceImpl.class);

	private QuestionDAO questionDAO;
	private ModelMapper modelMapper;

	@Autowired
	public QuestionServiceImpl(QuestionDAO questionDAO, ModelMapper modelMapper) {
		this.questionDAO = questionDAO;
		this.modelMapper = modelMapper;
	}

	@Override
	public QuestionDTO addQuestion(QuestionDTO questionDTO, String testId) {
		Assert.notNull(testId, "Test id can't be null");
		Assert.notNull(questionDTO, "Question DTO can't be null");
		Question question = modelMapper.map(questionDTO, Question.class);
		question = questionDAO.addQuestion(question, testId);
		questionDTO = modelMapper.map(question, QuestionDTO.class);
		return questionDTO;
	}

	@Override
	public List<QuestionDTO> getQuestions(String testId) {
		// TODO Auto-generated method stub
		return null;
	}

}
