package com.nexgen.quizer.test.testservice;

import com.nexgen.quizer.preptest.domain.Question;
import com.nexgen.quizer.test.ManageTest;
import com.nexgen.quizer.test.testdto.TestInfoDTO;

public interface ManageTestService {

	ManageTest createTest(ManageTest manageTest);

	int addNewQuestions(String tid, Question... questions); // returns no of question added to test

	Question editQuestion(String tid, String qid);

	Question updateQuestion(String tid, Question question);

	boolean deleteQuestion(String tid, String qid);

	ManageTest updateTest(ManageTest manageTest);

	boolean deleteTest(String tid);

	boolean enableTest(String tid);

	boolean disableTest(String tid);

	ManageTest publishTest(String tid);

	TestInfoDTO getBasicTestInfo(String tid);

}
