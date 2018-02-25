package oop.pset1.model;

import java.util.List;

public class Movie {
    private String title;

    private Double vote_avarage;

    private List <String> geners;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVote_avarage() {
        return vote_avarage;
    }

    public void setVote_avarage(Double vote_avarage) {
        this.vote_avarage = vote_avarage;
    }
    /*public List <String> getGeners() {
        return geners;
    }

    public void  setGeners(List<String> geners) {
        this.geners = geners;
    }*/

}

