package oop.pset3.lizardSpockGame.model;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;

public class RockMove implements Move {
    @Override
    public String sayWhichMove() {
        return "Rock";
    }

    @Override
    public boolean wins(Move move) {
        return (move.getClass() == ScissorsMove.class || move.getClass() == LizardMove.class);
    }
}

