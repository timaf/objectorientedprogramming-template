package oop.pset3.RockScissorsPaper_polymorphism.controller.model;

public interface Move {
    String sayWhichMove();
    Move judge(Move move);
}
