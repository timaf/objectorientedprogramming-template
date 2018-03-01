package oop.pset2.rockscissorspaper.controller.players;

import oop.pset2.rockscissorspaper.model.*;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComputerPlayer implements Player {

    @Override
    public Move start() {
        System.out.println("Computer: I want to play ");
        List <Move> moves = Stream.of(
                new PaperMove(),
                new RockMove(),
                new ScissorsMove())
                .collect(Collectors.toList());
        Collections.shuffle(moves);
        return moves.get(0);
    }
}