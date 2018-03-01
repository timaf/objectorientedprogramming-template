package oop.pset2.rockscissorspaper.controller.Rules;

import oop.pset2.rockscissorspaper.model.Move;

public class RockRule implements Rules {

        @Override
        public void judge(Move humenMove) {
            String result = humenMove.say();
            switch (result){
                case "Rock":
                    System.out.println("No winner!");
                    break;
                case "Scissors":
                    System.out.println("Computer wines");
                    break;
                case "Paper":
                    System.out.println("Humen  wines");
                    break;
            }
        }
    }

