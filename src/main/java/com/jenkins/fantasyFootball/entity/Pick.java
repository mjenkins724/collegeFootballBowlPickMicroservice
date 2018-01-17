package com.jenkins.fantasyFootball.entity;

public class Pick {

    private String teamName;
    private Integer spread;

    public Pick() {
    }

    public Pick(String teamName, Integer spread) {
        this.teamName = teamName;
        this.spread = spread;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getSpread() {
        return spread;
    }

    public void setSpread(Integer spread) {
        this.spread = spread;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pick{");
        sb.append("teamName='").append(teamName).append('\'');
        sb.append(", spread=").append(spread);
        sb.append('}');
        return sb.toString();
    }
}
