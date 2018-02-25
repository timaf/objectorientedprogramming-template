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
            //movieReview.setGeners(columns[3]));
            return  movieReview;
        };
    }

}
