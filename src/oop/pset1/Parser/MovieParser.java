package oop.pset1.Parser;

import oop.pset1.model.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieParser {
    public List<Movie> getMovies(){
        String filePath = "src/oop/pset1/data/test.csv";
        try{
            Stream<String> lines = Files.lines(Paths.get(filePath));
                return lines.skip(1)
                        .map(line -> line.split(";"))
                        .map(toMovie())
                        .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList <>();
        }
    }

    private Function<String[], Movie> toMovie() {
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


