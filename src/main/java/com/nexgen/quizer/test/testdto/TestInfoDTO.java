package com.nexgen.quizer.test.testdto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestInfoDTO {

	private double testScore;
	private String testAuthor;
	private int noOfQuestions;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private int noOfAttempts;
}
