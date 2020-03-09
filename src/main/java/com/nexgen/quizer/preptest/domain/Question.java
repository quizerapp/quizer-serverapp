package com.nexgen.quizer.preptest.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Question {

	private String questionId;
	private String questionData;
	private List<Options> options;
	private QuestionType questionType;
	private DifficultyLevel difficultyLevel;
	private List<String> keywords;
	private String author;
	private double score;
	private String topicName;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private String imagePath;

}
