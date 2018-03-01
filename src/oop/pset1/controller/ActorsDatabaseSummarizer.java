package oop.pset1.controller;

import oop.pset1.model.ActorSummary;
import oop.pset1.model.CastActor;
import java.util.List;
import java.util.stream.Collectors;

public class ActorsDatabaseSummarizer {
     public ActorSummary  summarize(List<CastActor> castReview){
         List<String> topHiredActors = castReview.stream()
               .map(cast -> cast.getName())
               .flatMap(castName -> castName.stream())
               .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
               .entrySet().stream()
               .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
               .limit(5)
               .map(e -> e.getKey() + " (" + e.getValue() + ")")
               .collect(Collectors.toList());


         List<Long> genderStatistics= castReview.stream()
                 .map(cast -> cast.getGender())
                 .flatMap(castName -> castName.stream())
                 .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                 .entrySet().stream()
                 .filter(e -> e.getKey().equals("1") || e.getKey().equals("2"))
                 .map(e -> e.getValue())
                 .collect(Collectors.toList());
        Long allGenders = (genderStatistics.get(0) + genderStatistics.get(1));
         Long femaleRatio = genderStatistics.get(0)*100/ allGenders;
         Long maleRatio = 100 - femaleRatio;
         Long[] genderRatio = {femaleRatio, maleRatio };


         ActorSummary theSummary = new ActorSummary();
         theSummary.setTopHeirdActors(topHiredActors);
         theSummary.setGenderRatio(genderRatio);
         return theSummary;


     }
}
