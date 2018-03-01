package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.controller.Rules.PaperRule;
import oop.pset2.rockscissorspaper.controller.Rules.RockRule;
import oop.pset2.rockscissorspaper.controller.Rules.ScissorRule;
import oop.pset2.rockscissorspaper.controller.players.ComputerPlayer;
import oop.pset2.rockscissorspaper.controller.players.HumanPlayer;
import oop.pset2.rockscissorspaper.model.Move;

import java.util.Scanner;

public class RockScissorsPaperGame {
    public void play() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        Move computerMove = computerPlayer.start();
        System.out.print("Do you want to play: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (answer.toLowerCase().startsWith("n")) {
            System.out.print("Too bad ");
            System.exit(0);
        }
        System.out.println("Computer: I have chosen, your turn " );
        HumanPlayer humanPlayer = new HumanPlayer();
        Move humanMove = humanPlayer.start();
        System.out.println("Computer: I have chosen : " + computerMove.say().toUpperCase());
        System.out.println("*********");

        if (computerMove.say().equals("Paper")) {
            PaperRule paperRule = new PaperRule();
            paperRule.judge(humanMove);
        }
        if (computerMove.say().equals("Rock")) {
            RockRule rockRule = new RockRule();
            rockRule.judge(humanMove);
        }
        if (computerMove.say().equals("Scissors")) {
            ScissorRule scissorRule = new ScissorRule();
            scissorRule.judge(humanMove);
        }
    }
}