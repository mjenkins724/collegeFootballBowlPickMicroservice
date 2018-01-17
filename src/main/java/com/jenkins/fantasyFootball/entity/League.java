package com.jenkins.fantasyFootball.entity;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class League {

    @Id
    private String id;
    private String name;
    private List<BowlGame> bowlGameMasterList;
    private List<PickSet> userPickSets;

    public League() {
    }

    public League(String name, List<BowlGame> bowlGameMasterList, List<PickSet> userPickSets) {
        this.name = name;
        this.bowlGameMasterList = bowlGameMasterList;
        this.userPickSets = userPickSets;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BowlGame> getBowlGameMasterList() {
        return bowlGameMasterList;
    }

    public void setBowlGameMasterList(List<BowlGame> bowlGameMasterList) {
        this.bowlGameMasterList = bowlGameMasterList;
    }

    public List<PickSet> getUserPickSets() {
        return userPickSets;
    }

    public void setUserPickSets(List<PickSet> userPickSets) {
        this.userPickSets = userPickSets;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("League{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", bowlGameMasterList=").append(bowlGameMasterList);
        sb.append(", userPickSets=").append(userPickSets);
        sb.append('}');
        return sb.toString();
    }
}
