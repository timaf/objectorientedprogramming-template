package oop.pset1.Parser;

import oop.pset1.model.Movie;


import java.util.function.Function;
public class MovieParser extends Parser {


    @Override
    protected Function<String[], Object> toObjects() {
        return columns -> {
            Movie movieReview = new Movie();
            movieReview.setTitle(columns[20]);
            movieReview.setVote_avarage(Double.parseDouble(columns[22]));
            movieReview.setGeners(toGetFields(columns[3], "name"));
            return movieReview;
        };
    }

}


