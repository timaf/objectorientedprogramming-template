package oop.pset3.RockScissorsPaper_polymorphism.controller;

import oop.pset3.RockScissorsPaper_polymorphism.controller.players.FirstPlayer;
import oop.pset3.RockScissorsPaper_polymorphism.controller.players.SecondPlayer;
import oop.pset3.RockScissorsPaper_polymorphism.controller.model.GroupOfMoves;
import oop.pset3.RockScissorsPaper_polymorphism.controller.model.Move;
import oop.pset3.RockScissorsPaper_polymorphism.controller.model.Rounds;
import oop.pset3.RockScissorsPaper_polymorphism.controller.view.Display;


public class TheRockScissorsPaperGame {

    GroupOfMoves movesList = new GroupOfMoves();
    FirstPlayer humanPlayer = new FirstPlayer();
    SecondPlayer computerPlayer = new SecondPlayer();
    Result result = new Result();
    Display display = new Display();

    public void play(){
        System.out.println("Play with me please. ");
        Move computerMove = computerPlayer.makeAmove(movesList);
        Move humanMove = humanPlayer.makeAmove(movesList);
        if(humanMove == null) {
            System.out.println("Wrong spelling");
            new Rounds().playAgain();
        }
        Move verdict = humanMove.judge(computerMove);
        String winner = result.whoWines(verdict, humanMove, computerMove);
        System.out.println("Computer: I have chosen : " + computerMove.sayWhichMove().toUpperCase());
        System.out.println("*********");
        display.display(winner);

    }
}
