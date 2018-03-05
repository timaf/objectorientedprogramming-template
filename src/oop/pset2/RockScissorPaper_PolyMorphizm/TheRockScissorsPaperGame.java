package oop.pset2.RockScissorPaper_PolyMorphizm;

import oop.pset2.RockScissorPaper_PolyMorphizm.controller.Judge;
import oop.pset2.RockScissorPaper_PolyMorphizm.controller.Result;
import oop.pset2.RockScissorPaper_PolyMorphizm.players.HumanPlayer;
import oop.pset2.RockScissorPaper_PolyMorphizm.players.Player;
import oop.pset2.RockScissorPaper_PolyMorphizm.players.ComputerPlayer;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.GroupOfMoves;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;
import oop.pset2.RockScissorPaper_PolyMorphizm.view.Display;


public class TheRockScissorsPaperGame {

    private GroupOfMoves movesList = new GroupOfMoves();
    private Player player1 = new HumanPlayer();
    private Player player2 = new ComputerPlayer();
    private Judge judge = new Judge();
    private Display display = new Display();

    public void play(){
        System.out.println("Computer: Play with me please. ");
        Move move1 = player1.makeAmove(movesList);
        Move move2 = player2.makeAmove(movesList);
        Result result = this.judge.judge(move1, move2);
        display.display(result);
        System.out.println("*********");

    }
}
