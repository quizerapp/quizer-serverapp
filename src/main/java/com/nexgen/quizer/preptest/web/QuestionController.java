package com.nexgen.quizer.preptest.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nexgen.quizer.preptest.dto.QuestionDTO;
import com.nexgen.quizer.preptest.service.QuestionService;

@RestController
@RequestMapping("api/questions/")
public class QuestionController {

	private static final Logger log = LoggerFactory.getLogger(QuestionController.class);
	@Autowired
	private QuestionService questionService;

	@PostMapping("{testid}/addquestion")
	public QuestionDTO addQuestion(@PathVariable("testid") String testId,@RequestBody QuestionDTO questionDTO) {
		log.info("{}",questionDTO);
		questionDTO = questionService.addQuestion(questionDTO, testId);
		log.info("Question is added to the test :{} with id :{}", testId, questionDTO.getId());
		return questionDTO;
	}

}
