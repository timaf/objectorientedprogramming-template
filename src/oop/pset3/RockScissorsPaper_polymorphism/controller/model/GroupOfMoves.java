package oop.pset3.RockScissorsPaper_polymorphism.controller.model;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupOfMoves {

    private static Set<Move> moves = Stream.of(
            new PaperMove(),
            new RockMove(),
            new ScissorsMove()
    ).collect(Collectors.toSet());

    public GroupOfMoves(){
    }

    public static Set<Move> getMoves()  {
        return new HashSet <Move>(moves);
    }
}
