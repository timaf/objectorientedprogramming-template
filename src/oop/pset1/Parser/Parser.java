package oop.pset1.Parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  abstract class Parser {
    public   List<Object> asList(String filePath) {
         try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .map(toObjects())
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    protected abstract Function<String[], Object> toObjects();


    protected List<String> toGetFields(String column, String theField) {
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
