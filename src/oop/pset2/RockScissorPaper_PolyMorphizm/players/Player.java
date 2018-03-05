package oop.pset2.RockScissorPaper_PolyMorphizm.players;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.GroupOfMoves;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;


public interface Player {
    Move makeAmove(GroupOfMoves moves);
}
