package com.nexgen.quizer.preptest.service;

import java.util.List;

import com.nexgen.quizer.preptest.dto.QuestionDTO;

public interface QuestionService {
	
			QuestionDTO addQuestion(QuestionDTO questionDTO,String testId);
			List<QuestionDTO> getQuestions(String testId);
			
}
