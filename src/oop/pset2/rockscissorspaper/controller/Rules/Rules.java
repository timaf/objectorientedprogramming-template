package oop.pset2.rockscissorspaper.controller.Rules;

import oop.pset2.rockscissorspaper.controller.moves.Move;
import oop.pset2.rockscissorspaper.controller.players.Player;

public interface Rules {
    void judge(Player player1, Player player2, Move move1, Move move2);
    }

