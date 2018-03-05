package oop.pset3.lizardSpockGame.model;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.PaperMove;

public class LizardMove implements Move {
    @Override
    public String sayWhichMove() {
        return "Lizard";
    }

    @Override
    public boolean wins(Move move) {
        return (move.getClass() == PaperMove.class || move.getClass() == SpockMove.class);
    }
}
