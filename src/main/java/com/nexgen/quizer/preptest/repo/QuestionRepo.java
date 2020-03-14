package com.nexgen.quizer.preptest.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nexgen.quizer.preptest.domain.Question;

public interface QuestionRepo extends MongoRepository<Question,String> {

}
