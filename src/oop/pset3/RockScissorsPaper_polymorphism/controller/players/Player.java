package oop.pset3.RockScissorsPaper_polymorphism.controller.players;

import oop.pset3.RockScissorsPaper_polymorphism.controller.model.GroupOfMoves;
import oop.pset3.RockScissorsPaper_polymorphism.controller.model.Move;


public interface Player {
    Move makeAmove(GroupOfMoves moves);
}
