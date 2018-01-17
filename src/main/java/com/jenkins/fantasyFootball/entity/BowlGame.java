package com.jenkins.fantasyFootball.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class BowlGame {

    private Integer gamePoints;
    private Integer spreadPoints;
    private Integer underdogPoints;
    private Date date;
    private String favoriteTeam;
    private String underdogTeam;
    private String favoriteRecord;
    private String underdogRecord;

    public BowlGame() {
    }

    public BowlGame(Integer gamePoints, Integer spreadPoints, Integer underdogPoints, Date date, String favoriteTeam, String underdogTeam, String favoriteRecord, String underdogRecord) {
        this.gamePoints = gamePoints;
        this.spreadPoints = spreadPoints;
        this.underdogPoints = underdogPoints;
        this.date = date;
        this.favoriteTeam = favoriteTeam;
        this.underdogTeam = underdogTeam;
        this.favoriteRecord = favoriteRecord;
        this.underdogRecord = underdogRecord;
    }

    public Integer getGamePoints() {
        return gamePoints;
    }

    public void setGamePoints(Integer gamePoints) {
        this.gamePoints = gamePoints;
    }

    public Integer getSpreadPoints() {
        return spreadPoints;
    }

    public void setSpreadPoints(Integer spreadPoints) {
        this.spreadPoints = spreadPoints;
    }

    public Integer getUnderdogPoints() {
        return underdogPoints;
    }

    public void setUnderdogPoints(Integer underdogPoints) {
        this.underdogPoints = underdogPoints;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    public String getUnderdogTeam() {
        return underdogTeam;
    }

    public void setUnderdogTeam(String underdogTeam) {
        this.underdogTeam = underdogTeam;
    }

    public String getFavoriteRecord() {
        return favoriteRecord;
    }

    public void setFavoriteRecord(String favoriteRecord) {
        this.favoriteRecord = favoriteRecord;
    }

    public String getUnderdogRecord() {
        return underdogRecord;
    }

    public void setUnderdogRecord(String underdogRecord) {
        this.underdogRecord = underdogRecord;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BowlGame{");
        sb.append(", gamePoints=").append(gamePoints);
        sb.append(", spreadPoints=").append(spreadPoints);
        sb.append(", underdogPoints=").append(underdogPoints);
        sb.append(", date=").append(date);
        sb.append(", favoriteTeam='").append(favoriteTeam).append('\'');
        sb.append(", underdogTeam='").append(underdogTeam).append('\'');
        sb.append(", favoriteRecord='").append(favoriteRecord).append('\'');
        sb.append(", underdogRecord='").append(underdogRecord).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
