package oop.pset2.RockScissorPaper_PolyMorphizm;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;

public class Result {

    public String whoWins(Move verdict, Move humanMove, Move computerMove){
        if(verdict == (null)){
            return "No one wins.";
        }
        else if(verdict.equals(humanMove)) {
            return "You win.";
        }else {
            return "Computer wins.";
        }

    }
}
