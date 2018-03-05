package oop.pset2.RockScissorPaper_PolyMorphizm.model;

public interface Move {
    String sayWhichMove();
    boolean wins(Move move);
}
