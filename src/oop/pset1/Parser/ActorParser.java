package oop.pset1.Parser;


import oop.pset1.model.CastActor;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ActorParser extends Parser {


    @Override
    protected Function<String[],Object> toObjects() {
        return columns -> {
            CastActor castReview = new CastActor();
            castReview.setName(toGetFields(columns[0], "name"));
            castReview.setGender(toGetFields(columns[0], "gender"));
            return castReview;
        };
    }


    private List<String> toGetFields(String column, String theField) {
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