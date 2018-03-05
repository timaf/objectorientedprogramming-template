package oop.pset3.lizardSpockGame.model;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.PaperMove;

public class ScissorsMove implements Move {
    @Override
    public String sayWhichMove() {
        return "Scissors";
    }

    @Override
    public boolean wins(Move move) {
        return (move.getClass() == PaperMove.class || move.getClass() == LizardMove.class);
    }
}
