package oop.pset2.rockscissorspaper.controller.players;

import oop.pset2.rockscissorspaper.model.Move;
import oop.pset2.rockscissorspaper.model.PaperMove;
import oop.pset2.rockscissorspaper.model.RockMove;
import oop.pset2.rockscissorspaper.model.ScissorsMove;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Player {
     public Move play(){
         List<Move> moves = Stream.of(
                 new PaperMove(),
                 new RockMove(),
                 new ScissorsMove())
                 .collect(Collectors.toList());
          Collections.shuffle(moves);
          Move theMove = moves.get(0);
          return theMove;
    }


    protected abstract void start();
}
