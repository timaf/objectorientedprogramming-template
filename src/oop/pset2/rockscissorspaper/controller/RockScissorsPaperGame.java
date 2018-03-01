package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.controller.Rules.PaperRule;
import oop.pset2.rockscissorspaper.controller.Rules.RockRule;
import oop.pset2.rockscissorspaper.controller.Rules.ScissorRule;
import oop.pset2.rockscissorspaper.controller.players.ComputerPlayer;
import oop.pset2.rockscissorspaper.controller.players.HumenPlayer;
import oop.pset2.rockscissorspaper.model.Move;

public class RockScissorsPaperGame {
    public void play() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        computerPlayer.start();
        HumenPlayer humenPlayer = new HumenPlayer();
        humenPlayer.start();
        Move computerMove = computerPlayer.play();
        System.out.println("Computer's move: "+ computerMove.say() );
        Move humenMove = humenPlayer.play();
        System.out.println("Humen's move: "+ humenMove.say() );
        if (computerMove.say().equals("Paper")) {
            PaperRule paperRule = new PaperRule();
            paperRule.judge(humenMove);
        }
        if (computerMove.say().equals("Rock")) {
            RockRule rockRule = new RockRule();
            rockRule.judge(humenMove);
        }
        if (computerMove.say().equals("Scissors")) {
            ScissorRule scissorRule = new ScissorRule();
            scissorRule.judge(humenMove);
        }
    }
}