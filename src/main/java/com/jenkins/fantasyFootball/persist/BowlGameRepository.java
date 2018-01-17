package com.jenkins.fantasyFootball.persist;

import com.jenkins.fantasyFootball.entity.BowlGame;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BowlGameRepository extends MongoRepository<BowlGame, String> {

}
