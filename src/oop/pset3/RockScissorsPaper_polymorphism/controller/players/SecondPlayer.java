package oop.pset3.RockScissorsPaper_polymorphism.controller.players;

import oop.pset3.RockScissorsPaper_polymorphism.controller.model.GroupOfMoves;
import oop.pset3.RockScissorsPaper_polymorphism.controller.model.Move;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class SecondPlayer implements Player {

    @Override
    public Move makeAmove(GroupOfMoves moves) {
        List <Move> theMoves = moves.getMoves().stream()
           .collect(Collectors.toList());
        Collections.shuffle(theMoves);
        return theMoves.get(0);
    }
}