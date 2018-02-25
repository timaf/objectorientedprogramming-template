package oop.pset1.Parser;

import oop.pset1.model.Movie;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieParser extends Parser {


    @Override
    protected Function<String[], Object> toObjects() {
        return columns -> {
            Movie movieReview = new Movie();
            movieReview.setTitle(columns[20]);
            movieReview.setVote_avarage(Double.parseDouble(columns[22]));
            movieReview.setGeners(toGeners(columns[3]));
            return movieReview;
        };
    }

    private List<String> toGeners(String column) {
        String objects = column.replaceAll("\\[", "").replaceAll("]", "");
        objects = objects.replaceAll("\\{", "").replaceAll("}", "");
        objects = objects.replaceAll("'", "");

        String[] words = objects.split(", ");
        return Stream.of(words)
                .map(word -> word.split(": "))
                .filter(word -> word[0].equals("name"))
                .map(word -> word[1])
                .collect(Collectors.toList());
    }


}


