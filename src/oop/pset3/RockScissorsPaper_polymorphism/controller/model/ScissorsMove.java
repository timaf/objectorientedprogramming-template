package oop.pset3.RockScissorsPaper_polymorphism.controller.model;

public class ScissorsMove implements Move {

     ScissorsMove() {
    }

    @Override
    public String sayWhichMove() {
        return "Scissors";
    }

    @Override
    public Move judge(Move move) {
        if (move.getClass() == RockMove.class) {
            return move;
        } else if (move.getClass() == PaperMove.class) {
            return ScissorsMove.this;
        } else {
            return null;
        }
    }
}

