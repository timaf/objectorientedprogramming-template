package oop.pset2.RockScissorPaper_PolyMorphizm.view;

import oop.pset2.RockScissorPaper_PolyMorphizm.controller.Result;

public class Display {
//    public void display(String result) {
//         System.out.println("The finale winner: " + result);
//        }

    public void display(Result result) {
        System.out.println("Player 1 move: " + result.getMove1().sayWhichMove());
        System.out.println("Player 2 move: " + result.getMove2().sayWhichMove());
        System.out.println(result.getWinner());
    }
}
