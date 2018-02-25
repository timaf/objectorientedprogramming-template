package oop.pset1.Parser;


import oop.pset1.model.CastActor;
import java.util.function.Function;


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

}