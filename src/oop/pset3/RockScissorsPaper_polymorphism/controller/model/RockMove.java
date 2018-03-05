package oop.pset3.RockScissorsPaper_polymorphism.controller.model;

public class RockMove implements Move {

    RockMove() {
    }

    @Override
    public String sayWhichMove() {
        return "Rock";
    }

    @Override
    public Move judge(Move move) {
        if (move.getClass() == PaperMove.class) {
            return move;
        } else if (move.getClass() == ScissorsMove.class) {
            return RockMove.this;
        } else {
            return null;
        }
    }
}


