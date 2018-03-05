package oop.pset2.RockScissorPaper_PolyMorphizm.players;

import oop.pset2.RockScissorPaper_PolyMorphizm.model.GroupOfMoves;
import oop.pset2.RockScissorPaper_PolyMorphizm.model.Move;

import java.util.Set;


public interface Player {
    Move makeAmove(Set<Move> moves);
}
