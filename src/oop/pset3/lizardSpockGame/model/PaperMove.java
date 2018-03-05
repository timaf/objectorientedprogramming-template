package oop.pset3.lizardSpockGame.model;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;

public class PaperMove implements Move {
    @Override
    public String sayWhichMove() {
        return "Paper";
    }

    @Override
    public boolean wins(Move move) {
        return (move.getClass() == SpockMove.class || move.getClass() == RockMove.class);
    }
}
