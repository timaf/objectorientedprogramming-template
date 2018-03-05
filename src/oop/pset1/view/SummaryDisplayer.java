package oop.pset1.view;

import oop.pset1.model.ActorSummary;
import oop.pset1.model.Summary;

public class SummaryDisplayer {
    public void display(Summary summary) {
        System.out.println("Most rated films:");
        summary.getTopRatedMovies()
                .forEach(System.out::println);
        System.out.println(" ------ ");
        System.out.println("Most appearing movie genres:");
        summary.getTopAppearingGenres()
                .forEach(System.out::println);
        System.out.println(" ------ ");
    }

    public void display(ActorSummary theSummary) {
        System.out.println("Most hired actors:");
        theSummary.getTopHiredActors()
                .forEach(System.out::println);
        System.out.println(" ------ ");

        Long[] ratio = theSummary.getGenderRatio();
        System.out.println("Actors male-female ratio:");
        System.out.println("Females: " + ratio[0]+"%"  );
        System.out.println("Males: " + ratio[1]+"%"  );
        System.out.println(" ------ ");
    }

    public void display () {
            System.out.println(" ------ ");
        }
    }
