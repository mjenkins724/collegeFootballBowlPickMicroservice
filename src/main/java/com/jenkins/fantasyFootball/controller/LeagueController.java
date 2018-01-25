package com.jenkins.fantasyFootball.controller;

import com.jenkins.fantasyFootball.entity.League;
import com.jenkins.fantasyFootball.persist.LeagueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/league")
public class LeagueController {

    public final static Logger logger = LoggerFactory.getLogger(LeagueController.class);

    @Autowired
    private LeagueRepository leagueRepository;

    // -------------------- Get all leagues -------------------
    @RequestMapping(value="", method= RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    ResponseEntity<List<League>> getLeagues() {
        logger.debug("Getting all leagues");

        List<League> leagues = leagueRepository.findAll();

        if (leagues == null || leagues.isEmpty()) {
            logger.debug("No leagues exist.");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(leagues, HttpStatus.OK);
    }

    // -------------------- Get a single league by id -------------------
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @CrossOrigin
    ResponseEntity<?> getLeague(@PathVariable("id") String id) {
        logger.debug("Getting league with id: {}", id);

        League league = leagueRepository.findOne(id);

        if (league == null) {
            logger.debug("League does not exist.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(league, HttpStatus.OK);
    }

    // -------------------- Create a new league -------------------
    @RequestMapping(value="", method=RequestMethod.POST)
    @CrossOrigin
    public ResponseEntity<?> createLeague(@RequestBody League league) {
        logger.debug("Inserting new league with name: {}", league.getName());

        if (leagueRepository.findByName(league.getName()) != null) {
            logger.debug("League already exists with this name. Not inserting.");
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        leagueRepository.save(league);

        return new ResponseEntity<>(league, HttpStatus.CREATED);
    }

    // -------------------- Update a league -------------------
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    @CrossOrigin
    public ResponseEntity<?> updateLeague(@PathVariable("id") String id, @RequestBody League league) {
        logger.debug("Updating league with id: {}", id);

        League leagueToUpdate = leagueRepository.findOne(id);

        if (leagueToUpdate == null) {
            logger.debug("League was not found. Not updating.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        leagueToUpdate.setName(league.getName());
        leagueToUpdate.setBowlGameMasterList(league.getBowlGameMasterList());
        leagueToUpdate.setUserPickSets(league.getUserPickSets());

        leagueRepository.save(leagueToUpdate);

        return new ResponseEntity<>(leagueToUpdate, HttpStatus.OK);
    }

    // -------------------- Delete a league -------------------
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @CrossOrigin
    public ResponseEntity<League> deleteLeague(@PathVariable("id") String id) {
        logger.debug("Deleting league with id: {}", id);
        if (leagueRepository.findOne(id) == null) {
            logger.debug("League was not found. Not deleting.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        leagueRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // -------------------- Delete all leagues -------------------
    @RequestMapping(value="", method=RequestMethod.DELETE)
    @CrossOrigin
    public ResponseEntity<League> deleteLeague() {
        logger.debug("Deleting all leagues");

        leagueRepository.deleteAll();

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
