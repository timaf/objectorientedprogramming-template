package oop.pset1.model;


import java.util.List;

public class ActorSummary {
    private List<String> topHeirdActors;
    private Long[] genderRatio;

    public List <String> getTopHeirdActors() {
        return topHeirdActors;
    }

    public Long[] getGenderRatio() {
        return genderRatio;
    }

    public void setTopHeirdActors(List <String> topHeirdActors) {
        this.topHeirdActors = topHeirdActors;
    }

    public void setGenderRatio(Long[] genderRatio) {
        this.genderRatio = genderRatio;
    }
}
