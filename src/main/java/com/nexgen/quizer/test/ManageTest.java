package com.nexgen.quizer.test;

import java.time.LocalDateTime;
import java.util.List;

import com.nexgen.quizer.preptest.domain.Question;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ManageTest {

	private String testId;
	private String testTitle;
	private String testAuthor;
	private LocalDateTime testCreatedAt;
	private LocalDateTime testUpdatedAt;
	private double testScore;
	private TestConfig testConfig;
	private List<Question> questions;

}
