package oop.pset2.rockscissorspaper.view;

import oop.pset2.rockscissorspaper.model.Move;
import oop.pset2.rockscissorspaper.view.Rules;

public class ScissorRule implements Rules {
    @Override
    public void judge(Move humanMove) {
        String result = humanMove.say();
        switch (result){
            case "Scissors":
                System.out.println("No winner!");
                break;
            case "Rock":
                System.out.println("Humen wines");
                break;
            case "Paper":
                System.out.println("Computer  wines");
                break;
        }
    }
}

