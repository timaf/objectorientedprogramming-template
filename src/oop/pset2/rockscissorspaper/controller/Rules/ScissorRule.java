package oop.pset2.rockscissorspaper.controller.Rules;

import oop.pset2.rockscissorspaper.model.Move;

public class ScissorRule implements Rules {
    @Override
    public void judge(Move humanMove) {
        String result = humanMove.say();
        switch (result){
            case "Scissors":
                System.out.println("No winner!");
                break;
            case "Rock":
                System.out.println("Computer wines");
                break;
            case "Paper":
                System.out.println("Human  wines");
                break;
        }
    }
}

