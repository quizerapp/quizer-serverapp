package com.nexgen.quizer.preptest.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Options {
	
	private String optionData;
	private  double score;
	private boolean isCorrectAnswer;

}
