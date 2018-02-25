package oop.pset1;

import oop.pset1.Parser.ActorParser;
import oop.pset1.Parser.MovieParser;
import oop.pset1.controller.ActorsDatabaseSummarizer;
import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.model.CastActor;
import oop.pset1.model.ActorSummary;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;
import oop.pset1.view.SummaryDisplayer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Pset1Main {

    private static Summary summary;
    private static ActorSummary theSummary;

    public static void main(String[] args) {
        MovieParser movieParser = new  MovieParser();
        String moviePath =  "src/oop/pset1/data/test.csv";
        List<Movie> movies = movieParser.asList(moviePath).stream()
                .map(object -> (Movie) object)
                .collect(Collectors.toList());

        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        SummaryDisplayer displayer = new SummaryDisplayer();

        Optional<Summary> summary = Optional.ofNullable(summarizer.summarize(movies));
        if(summary.isPresent()){
            displayer.display(summary.get());
        } else {
            displayer.display();
        }

        ActorParser actorParser = new ActorParser();
        String actorPath = "src/oop/pset1/data/actors.csv";
        List<CastActor> actores = actorParser.asList(actorPath).stream()
                .map(object -> (CastActor) object)
                .collect(Collectors.toList());

        ActorsDatabaseSummarizer theSummarizer = new ActorsDatabaseSummarizer();
        SummaryDisplayer theDisplayer = new SummaryDisplayer();

        Optional<ActorSummary> theSummary = Optional.ofNullable(theSummarizer.summarize(actores));
        if(theSummary.isPresent()){
            theDisplayer.display(theSummary.get());
        } else {
            theDisplayer.display();
        }
    }
}
