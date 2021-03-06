package com.jenkins.fantasyFootball.entity;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class PickSet {

    private String userName;
    private List<Pick> userPicks;

    public PickSet() {
    }

    public PickSet(String userName, List<Pick> userPicks) {
        this.userName = userName;
        this.userPicks = userPicks;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Pick> getUserPicks() {
        return userPicks;
    }

    public void setUserPicks(List<Pick> userPicks) {
        this.userPicks = userPicks;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PickSet{");
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userPicks=").append(userPicks);
        sb.append('}');
        return sb.toString();
    }
}
