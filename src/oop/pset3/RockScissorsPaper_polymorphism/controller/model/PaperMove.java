package oop.pset3.RockScissorsPaper_polymorphism.controller.model;

public class PaperMove implements Move {

    PaperMove() {
    }

    @Override
    public String sayWhichMove() {
        return "Paper";
    }

    @Override
    public Move judge(Move move) {
        if (move.getClass() == RockMove.class) {
            return PaperMove.this;
        } else if (move.getClass() == ScissorsMove.class) {
            return move;
        } else {
            return null;
        }
    }

}