package oop.pset2.rockscissorspaper.controller.players;

import oop.pset2.rockscissorspaper.model.Move;
import oop.pset2.rockscissorspaper.model.PaperMove;
import oop.pset2.rockscissorspaper.model.RockMove;
import oop.pset2.rockscissorspaper.model.ScissorsMove;
import java.util.Scanner;
import java.util.stream.Stream;

public class HumanPlayer implements Player {

    @Override
    public Move start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your choice:  Rock or Scissors or Paper ??? ");
        String choice = scanner.next();
        Move move = Stream.of(
                new PaperMove(),
                new RockMove(),
                new ScissorsMove())
                .filter(e -> e.say().equalsIgnoreCase(choice))
                .findFirst().get();
        if(move == null){
            System.out.println("Typo error. Try a gain ");
        }
        return move;

    }
  }
