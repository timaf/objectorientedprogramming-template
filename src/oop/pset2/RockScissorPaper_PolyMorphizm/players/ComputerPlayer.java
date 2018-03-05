package oop.pset2.RockScissorPaper_PolyMorphizm.players;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.GroupOfMoves;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ComputerPlayer implements Player {

    @Override
    public Move makeAmove(GroupOfMoves moves) {
        List <Move> theMoves = moves.getMoves().stream()
           .collect(Collectors.toList());
        Collections.shuffle(theMoves);
        return theMoves.get(0);
    }
}