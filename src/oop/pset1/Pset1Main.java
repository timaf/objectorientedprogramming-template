package oop.pset1;

import oop.pset1.Parser.MovieParser;
import oop.pset1.controller.MovieDatabaseSummarizer;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;
import oop.pset1.view.SummaryDisplayer;

import java.util.List;
import java.util.Optional;

public class Pset1Main {

    private static Summary summary;

    public static void main(String[] args) {
        MovieParser parser = new  MovieParser();
        List<Movie> movies = parser.getMovies();

        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        SummaryDisplayer displayer = new SummaryDisplayer();

        Optional<Summary> summary = Optional.ofNullable(summarizer.summarize(movies));
        if(summary.isPresent()){
            displayer.display(summary.get());
        } else {
            displayer.display();
        }
    }
}
