package oop.pset2.RockScissorPaper_PolyMorphizm;

import oop.pset2.RockScissorPaper_PolyMorphizm.controller.Rounds;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.GroupOfMoves;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;

import java.util.Set;

public class TheRockScissorsPaperMain {

    public static void main(String[] args) {
        Set <Move> moves = GroupOfMoves.getMoves();
        new Rounds().playAgain(moves);
    }
}
