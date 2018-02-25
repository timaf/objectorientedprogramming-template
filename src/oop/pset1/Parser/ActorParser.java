package oop.pset1.Parser;

import oop.pset1.model.Actor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActorParser {

    public List <Actor> getActors() {
        String filePath = "src/oop/pset1/data/actorTest.csv";
        try {
            Stream <String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .map(toActor())
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList <>();
        }
    }

    private Function <String[], Actor> toActor() {
        return columns -> {
            Actor actorReview = new Actor();
            actorReview.setName(toGetFields(columns[0], "name").toString());
            actorReview.setGender(toGetFields(columns[0], "gender").toString());
            return actorReview;
        };
    }

    private List <String> toGetFields(String column, String theField) {
        String objects = column.replaceAll("\\[", "").replaceAll("]", "");
        objects = objects.replaceAll("\\{", "").replaceAll("}", "");
        objects = objects.replaceAll("'", "");

        String[] words = objects.split(", ");
        return Stream.of(words)
                .map(word -> word.split(": "))
                .filter(word -> word[0].equals(theField))
                .map(word -> word[1])
                .collect(Collectors.toList());
    }
}