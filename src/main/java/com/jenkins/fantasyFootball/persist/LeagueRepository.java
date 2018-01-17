package com.jenkins.fantasyFootball.persist;

import com.jenkins.fantasyFootball.entity.League;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeagueRepository extends MongoRepository<League, String> {

    League findByName(String name);
}
