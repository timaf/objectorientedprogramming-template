package oop.pset1.model;


import java.util.List;

public class ActorSummary {
    private List<String> topHeirdActors;
    private List <String> genderRatio;

    public List <String> getTopHeirdActors() {
        return topHeirdActors;
    }

    public List <String> getGenderRatio() {
        return genderRatio;
    }

    public void setTopHeirdActors(List <String> topHeirdActors) {
        this.topHeirdActors = topHeirdActors;
    }

    public void setGenderRatio(List <String> genderRatio) {
        this.genderRatio = genderRatio;
    }
}
