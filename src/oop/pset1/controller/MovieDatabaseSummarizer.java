package oop.pset1.controller;

import oop.pset1.model.Movie;
import oop.pset1.model.Summary;

import java.util.List;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {
    public Summary  summarize(List<Movie> movieReview){
        List<String> topRatedMovies = movieReview.stream()
                .sorted((e1, e2) -> e2.getVote_avarage().compareTo(e1.getVote_avarage()))
                .limit(5)
                .map(e -> e.getTitle() + " (" + e.getVote_avarage() + ")")
                .collect(Collectors.toList());

        Summary summary = new Summary();
        summary.setTopRatedMovies(topRatedMovies);


        return summary;

    }
}
