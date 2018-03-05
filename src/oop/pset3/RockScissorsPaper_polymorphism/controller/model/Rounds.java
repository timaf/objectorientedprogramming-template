package oop.pset3.RockScissorsPaper_polymorphism.controller.model;

import oop.pset3.RockScissorsPaper_polymorphism.controller.TheRockScissorsPaperGame;
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