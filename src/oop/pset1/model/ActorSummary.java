package oop.pset1.model;


import java.util.List;

public class ActorSummary {
    private List<String> topHiredActors;
    private Long[] genderRatio;

    public List <String> getTopHiredActors() {
        return topHiredActors;
    }

    public Long[] getGenderRatio() {
        return genderRatio;
    }

    public void setTopHiredActors(List <String> topHiredActors) {
        this.topHiredActors = topHiredActors;
    }

    public void setGenderRatio(Long[] genderRatio) {
        this.genderRatio = genderRatio;
    }
}
