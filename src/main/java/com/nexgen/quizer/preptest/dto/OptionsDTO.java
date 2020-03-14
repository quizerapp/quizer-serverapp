package com.nexgen.quizer.preptest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OptionsDTO {
	private String optionData;
	private  double score;
	private boolean isCorrectAnswer;
}
