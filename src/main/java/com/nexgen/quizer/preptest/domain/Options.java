package com.nexgen.quizer.preptest.domain;

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
public class Options {

	private String optionData;
	private double score;
	private boolean isCorrectAnswer;

}
