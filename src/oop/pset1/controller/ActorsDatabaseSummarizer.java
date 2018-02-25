package oop.pset1.controller;

import oop.pset1.model.Actor;
import oop.pset1.model.ActorSummary;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActorsDatabaseSummarizer {
     public ActorSummary  summarize(List<Actor> actorReview){
         List<String> topHeirdActors = actorReview.stream()
               .map(Actor::getName)
               .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
               .entrySet().stream()
               .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
               .limit(5)
               .map(e -> e.getKey() + " (" + e.getValue() + ")")
               .collect(Collectors.toList());


         Map<String, Long> allActorsGender= actorReview.stream()
                 .map(Actor::getGender)
                 //.flatMap(gender -> gender.stream())
                 .collect(Collectors.groupingBy(e -> e, Collectors.counting()));


         List<String> genderRatio = allActorsGender.entrySet().stream()
                 .map(e -> e.getKey() + " (" + e.getValue() + ")")
                 .collect(Collectors.toList());



         ActorSummary theSummary = new ActorSummary();
         theSummary.setTopHeirdActors(topHeirdActors);
         theSummary.setGenderRatio(genderRatio);
         return theSummary;


     }
}
