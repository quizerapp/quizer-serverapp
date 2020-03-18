package com.nexgen.quizer.test;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TestConfig {
	private boolean isTestEnabled;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private boolean canViewAnswers;
	private boolean canViewScore;
	private int noOfAttempts;
}
