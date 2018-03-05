package oop.pset2.RockScissorPaper_PolyMorphizm.model;

import oop.pset2.RockScissorPaper_PolyMorphizm.TheRockScissorsPaperGame;
import java.util.Scanner;

public class Rounds {

    public void playAgain() {
        String answer;
        do{
            new TheRockScissorsPaperGame().play();
            System.out.print("Do you want to play?? ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();
        } while (answer.toLowerCase().startsWith("y"));

        System.out.print("Game over ");
        System.exit(0);
    }
}