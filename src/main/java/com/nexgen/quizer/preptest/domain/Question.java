package com.nexgen.quizer.preptest.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AuditorAware;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Question implements AuditorAware<String> {
	@Id
	private String id;
	private String questionData;
	private List<Options> options;
	private QuestionType questionType;
	private DifficultyLevel difficultyLevel;
	private List<String> keywords;
	private double score;
	private String topicName;
	private String imagePath;
	
	@CreatedBy
	private String author;
	@CreatedDate
	private LocalDateTime createdAt;
	@LastModifiedDate
	private LocalDateTime updatedAt;
	@Override
	public Optional<String> getCurrentAuditor() {
		// Should get from security context
		return Optional.of("Quizer Admin");
	}

}
