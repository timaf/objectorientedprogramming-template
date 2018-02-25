package oop.pset1.view;

import oop.pset1.model.ActorSummary;
import oop.pset1.model.Summary;

public class SummaryDisplayer {
    public void display(Summary summary) {
        summary.getTopRatedMovies()
                .forEach(System.out::println);
        System.out.println(" ------ ");

        summary.getTopAppearingGenres()
                .forEach(System.out::println);
        System.out.println(" ------ ");
    }

    public void display(ActorSummary theSummary) {
        theSummary.getTopHeirdActors()
                .forEach(System.out::println);
        System.out.println(" ------ ");

        theSummary.getGenderRatio()
                .forEach(System.out::println);
        System.out.println(" ------ ");
    }

    public void display () {
            System.out.println(" ------ ");
        }
    }
