package oop.pset3.lizardSpockGame.model;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.RockMove;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.ScissorsMove;

public class SpockMove implements Move {
    @Override
    public String sayWhichMove() {
        return "Spock";
    }

    @Override
    public boolean wins(Move move) {
        return (move.getClass() == RockMove.class || move.getClass() == ScissorsMove.class);
    }
}
