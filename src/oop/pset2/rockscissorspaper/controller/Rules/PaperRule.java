package oop.pset2.rockscissorspaper.controller.Rules;

import oop.pset2.rockscissorspaper.model.Move;

public class PaperRule implements Rules {
    @Override
    public void judge(Move humenMove) {
        String result = humenMove.say();
        switch (result){
            case "Paper":
                System.out.println("No winner!");
                break;
            case "Rock":
                System.out.println("Computer wines");
                break;
            case "Scissors":
                System.out.println("Humen  wines");
                break;
        }
    }
}