package com.nexgen.quizer.preptest.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.nexgen.quizer.preptest.domain.DifficultyLevel;
import com.nexgen.quizer.preptest.domain.Options;
import com.nexgen.quizer.preptest.domain.QuestionType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class QuestionDTO {

	private String id;
	private String questionData;
	private List<Options> options;
	private QuestionType questionType;
	private DifficultyLevel difficultyLevel;
	private List<String> keywords;
	private double score;
	private String topicName;
	private String imagePath;
	private String author;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}
