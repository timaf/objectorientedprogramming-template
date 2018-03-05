package oop.pset3.RockScissorsPaper_polymorphism.controller;

import oop.pset3.RockScissorsPaper_polymorphism.controller.model.Move;

public class Result {

    public String whoWines(Move verdict, Move humanMove,  Move computerMove){
        if(verdict.equals(null)){
            return "No one wines.";
        }
        else if(verdict.equals(humanMove)) {
            return "You wine.";
        }else {
            return "Computer wins.";
        }

    }
}
